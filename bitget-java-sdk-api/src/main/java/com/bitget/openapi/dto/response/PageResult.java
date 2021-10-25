package com.bitget.openapi.dto.response;

import lombok.*;

import java.io.Serializable;
import java.util.List;

/**
 * ( 用户信息VO )
 *
 * @author hupengfei
 * @create 2020/3/13
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class PageResult<T> implements Serializable {
	/**
	 * 是否有下一页
	 */
	 private Boolean nextFlag;
	/**
	 *
	 */
	private List<T> rows;

	private Integer totals;
}