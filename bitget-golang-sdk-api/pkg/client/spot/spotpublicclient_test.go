package spot

import (
	"fmt"
	"testing"
)

func TestSpotPublicClient_Time(t *testing.T) {
	client := new(SpotPublicClient).Init()

	resp, err := client.Time()
	if err != nil {
		println(err.Error())
	}
	fmt.Println(resp)
}

func TestSpotPublicClient_Currencies(t *testing.T) {
	client := new(SpotPublicClient).Init()

	resp, err := client.Currencies()
	if err != nil {
		println(err.Error())
	}
	fmt.Println(resp)
}

func TestSpotPublicClient_Product(t *testing.T) {
	client := new(SpotPublicClient).Init()

	resp, err := client.Product("ETHUSDT_SPBL")
	if err != nil {
		println(err.Error())
	}
	fmt.Println(resp)
}

func TestSpotPublicClient_Products(t *testing.T) {
	client := new(SpotPublicClient).Init()

	resp, err := client.Products()
	if err != nil {
		println(err.Error())
	}
	fmt.Println(resp)
}
