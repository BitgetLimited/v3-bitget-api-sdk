package common

import (
	"crypto/hmac"
	"crypto/sha256"
	"encoding/base64"
	"strings"
)

type Signer struct {
	secretKey []byte
}

func (p *Signer) Init(key string) *Signer {
	p.secretKey = []byte(key)
	return p
}

func (p *Signer) Sign(method string, requestPath string, body string, timesStamp string) string {

	var payload strings.Builder
	payload.WriteString(timesStamp)
	payload.WriteString(method)
	payload.WriteString(requestPath)
	if body != "" && body != "?" {
		payload.WriteString(body)
	}
	hash := hmac.New(sha256.New, p.secretKey)
	hash.Write([]byte(payload.String()))
	result := base64.StdEncoding.EncodeToString(hash.Sum(nil))
	return result
}
