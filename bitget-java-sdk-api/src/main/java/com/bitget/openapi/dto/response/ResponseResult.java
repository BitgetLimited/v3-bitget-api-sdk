package com.bitget.openapi.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * ResponseBody注解返回的JSON对象类
 *
 * @author upex-team
 * @date 2019/12/30
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ResponseResult<T> implements Serializable {

    /**
     * 200成功
     */
    private String httpCode = "200";

    /**
     * 00000表示成功，>0表示失败,<0系统保留
     */
    private String code;

    /**
     * 提示信息
     */
    private String msg;

    /**
     * 系统时间
     */
    private Long requestTime;

    /**
     * 返回数据
     */
    private T data;
}
