package com.bitget.openapi.dto.request;

import lombok.Data;

import java.io.Serializable;

@Data
public class OrderData implements Serializable {
	private String client_oid;
	private String order_type;
	/**
	 * Entrusted price
	 */
	private String price;
	/**
	 * Entrusted quantity
	 */
	private String size;
	private String type;
	/**
	 * Whether to place an order at the competitor's price
	 */
	private String match_price;
	
}
