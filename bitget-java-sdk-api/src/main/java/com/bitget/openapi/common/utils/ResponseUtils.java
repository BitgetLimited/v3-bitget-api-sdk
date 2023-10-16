package com.bitget.openapi.common.utils;

import com.alibaba.fastjson.JSON;
import com.bitget.openapi.common.exception.BitgetApiException;
import com.bitget.openapi.dto.response.ResponseResult;

public class ResponseUtils {
    public static final String SUCCESS = "200";

    public static ResponseResult handleResponse(ResponseResult response) {
        if (!SUCCESS.equals(response.getHttpCode())) {
            throw new BitgetApiException(JSON.toJSONString(response), response.getHttpCode(), response.getCode(), response.getMsg());
        }

        return response;
    }
}
