package com.bitget.openapi.service.spot;

import com.bitget.openapi.dto.response.ResponseResult;

import java.io.IOException;

public interface SpotPublicService {

    ResponseResult time() throws IOException;

    ResponseResult currencies() throws IOException;

    ResponseResult products() throws IOException;

    ResponseResult product(String symbol) throws IOException;

}
