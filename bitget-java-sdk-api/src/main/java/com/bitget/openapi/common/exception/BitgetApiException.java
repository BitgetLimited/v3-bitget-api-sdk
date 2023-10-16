package com.bitget.openapi.common.exception;

public class BitgetApiException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    private final String httpStatusCode;
    private final String errorCode;
    private String errMsg;

    public BitgetApiException(String fullErrMsg, String httpStatusCode) {
        super(fullErrMsg);
        this.httpStatusCode = httpStatusCode;
        this.errorCode = "-1";
    }

    public BitgetApiException(String fullErrMsg, String httpStatusCode, String errorCode, String errMsg) {
        super(fullErrMsg);
        this.httpStatusCode = httpStatusCode;
        this.errorCode = errorCode;
        this.errMsg = errMsg;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getHttpStatusCode() {
        return httpStatusCode;
    }

    public String getErrMsg() {
        return errMsg;
    }
}
