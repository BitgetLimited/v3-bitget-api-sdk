package com.bitget.openapi.dto.request;

import lombok.Data;

import java.io.Serializable;

@Data
public class OrderData implements Serializable {
	private String client_oid;
	private String order_type;
	/**
	 * 委托价
	 */
	private String price;
	/**
	 * 委托量
	 */
	private String size;
	private String type;
	/**
	 * 是否以对手价下单
	 */
	private String match_price;
	
}
