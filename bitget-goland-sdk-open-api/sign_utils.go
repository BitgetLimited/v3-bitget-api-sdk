package openapi

import (
	"crypto/hmac"
	"crypto/sha256"
	"encoding/base64"
	"fmt"
	"os"
	"strconv"
	"strings"
	"time"
)

func Sign(method string, path string, query string, body string, timesStamp string, secretKey string) string {

	var payload strings.Builder
	payload.WriteString(timesStamp)
	payload.WriteString(method)
	if query != "" {
		payload.WriteString(path)
		payload.WriteString("?")
		payload.WriteString(query)
	} else {
		payload.WriteString(path)
	}
	payload.WriteString(body)
	fmt.Fprintf(os.Stdout, "payload: %s\n", payload.String())

	hash := hmac.New(sha256.New, []byte(secretKey))
	hash.Write([]byte(payload.String()))
	result := base64.StdEncoding.EncodeToString(hash.Sum(nil))
	return result
}

func GetTimesStamp() string {
	timesStamp := time.Now().Unix() * 1000
	return strconv.FormatInt(timesStamp, 10)
}