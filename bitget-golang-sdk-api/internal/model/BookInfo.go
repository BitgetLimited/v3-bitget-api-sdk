package model

import (
	"bitget/logging/applogger"
	"hash/crc32"
	"sort"
	"strconv"
	"strings"
)

type BookInfo struct {
	Asks     []interface{} `json:"asks"`
	Bids     []interface{} `json:"bids"`
	Checksum string        `json:"checksum"`
}

func (p BookInfo) Merge(bookinfo BookInfo) BookInfo {
	p.Asks = p.innerMerge(p.Asks, bookinfo.Asks, false)
	p.Bids = p.innerMerge(p.Bids, bookinfo.Bids, true)
	return p
}
func (p *BookInfo) innerMerge(allList []interface{}, updateList []interface{}, isReverse bool) []interface{} {
	var priceAndValue = make(map[float64][]interface{})

	var result []interface{}

	for i := 0; i < len(allList); i++ {
		var v = allList[i].([]interface{})[0]
		key, _ := strconv.ParseFloat(v.(string), 2)
		priceAndValue[key] = allList[i].([]interface{})
	}

	for i := 0; i < len(updateList); i++ {
		var v = updateList[i].([]interface{})[0]
		key, _ := strconv.ParseFloat(v.(string), 2)
		if updateList[i].([]interface{})[1] == "0" {
			delete(priceAndValue, key)
			continue
		}
		priceAndValue[key] = updateList[i].([]interface{})
	}

	for _, v := range priceAndValue {
		result = append(result, v)
	}

	//for key := range keys {
	//	i,e := priceAndValue[sortKeys[key]]
	//	if e {
	//		result = append(result, i)
	//	}
	//}

	sort.Slice(result, func(i, j int) bool {

		o1 := result[i].([]interface{})[0].(string)
		o2 := result[j].([]interface{})[0].(string)
		o1F, _ := strconv.ParseFloat(o1, 2)
		o2F, _ := strconv.ParseFloat(o2, 2)
		if isReverse {
			return o1F > o2F
		} else {
			return o1F < o2F
		}
	})
	return result
}

func (p *BookInfo) CheckSum(checksum uint32) bool {

	var payload strings.Builder
	for i := 0; i < 25; i++ {

		bidsLen := len(p.Bids)
		asksLen := len(p.Asks)

		if bidsLen > i {
			payload.WriteString(p.Bids[i].([]interface{})[0].(string))
			payload.WriteString(":")
			payload.WriteString(p.Bids[i].([]interface{})[1].(string))
			payload.WriteString(":")
		}
		if asksLen > i {
			payload.WriteString(p.Asks[i].([]interface{})[0].(string))
			payload.WriteString(":")
			payload.WriteString(p.Asks[i].([]interface{})[1].(string))
			payload.WriteString(":")
		}

		asksLen--
		bidsLen--
	}
	var resultStr = payload.String()[0 : payload.Len()-1]

	applogger.Info("mergeStr:" + resultStr)
	var allCheckSum = crc32.ChecksumIEEE([]byte(resultStr))
	applogger.Info("mergeVal:" + strconv.Itoa(int(allCheckSum)) + ",checkSum:" + strconv.Itoa(int(checksum)))
	return allCheckSum == checksum
}
