package com.bitget.openapi.dto.response;

import lombok.*;
import java.io.Serializable;

/**
 * @Author: bitget-sdk-team
 * @Date: 2022-09-30 10:46
 * @DES: Response results
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResponseResult<T> implements Serializable {

    private static final long serialVersionUID = -1L;

    /**
     * Response 00000 means success, greater than 0 means failure, less than 0 means system reservation
     */
    private String code;

    /**
     * Prompt information
     */
    private String msg;

    /**
     * system time
     */
    private Long requestTime;
    /**
     * Return Data
     */
    private T data;
}
