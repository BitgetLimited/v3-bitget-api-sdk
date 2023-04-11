package com.bitget.openapi;

import org.apache.commons.lang3.StringUtils;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.management.RuntimeErrorException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class SignatureUtils {
    public static final String HMAC_SHA256 = "HmacSHA256";
    public static final String CHARSET = "UTF-8";
    public static Mac MAC;

    static {
        try {
            SignatureUtils.MAC = Mac.getInstance(SignatureUtils.HMAC_SHA256);
        } catch (NoSuchAlgorithmException var1) {
            throw new RuntimeErrorException(new Error("Can't get Mac's instance."));
        }
    }

    /**
     * signature algorithm
     *
     * @param timestamp
     * @param method
     * @param requestPath
     * @param queryString
     * @param body
     * @param secretKey
     * @return java.lang.String
     * @description ACCESS-SIGN of The request header is correct timestamp + method + requestPath
     * + "?" + queryString + body The string (+indicates string connection) is encrypted using the HMAC SHA256 method and output through BASE64 encoding。
     * @author jian.li
     * @date 2020-06-02 17:04
     */
    public static String generate(String timestamp, String method, String requestPath,
                                  String queryString, String body, String secretKey)
            throws CloneNotSupportedException, InvalidKeyException, UnsupportedEncodingException {

        method = method.toUpperCase();
        body = StringUtils.defaultIfBlank(body, StringUtils.EMPTY);
        queryString = StringUtils.isBlank(queryString) ? StringUtils.EMPTY : "?" + queryString;

        String preHash = timestamp + method + requestPath + queryString + body;
        byte[] secretKeyBytes = secretKey.getBytes(SignatureUtils.CHARSET);
        SecretKeySpec secretKeySpec = new SecretKeySpec(secretKeyBytes, SignatureUtils.HMAC_SHA256);
        Mac mac = (Mac) SignatureUtils.MAC.clone();
        mac.init(secretKeySpec);
        return Base64.getEncoder().encodeToString(mac.doFinal(preHash.getBytes(SignatureUtils.CHARSET)));
    }

    /**
     * websocket Signature encryption
     *
     * @param timestamp
     * @param method
     * @param requestPath
     * @param secretKey
     * @return
     * @throws CloneNotSupportedException
     * @throws InvalidKeyException
     * @throws UnsupportedEncodingException
     */
    public static String ws_sign(String timestamp, String method, String requestPath, String secretKey)
            throws CloneNotSupportedException, InvalidKeyException, UnsupportedEncodingException {
        method = method.toUpperCase();
        String preHash = timestamp + method + requestPath;
        byte[] secretKeyBytes = secretKey.getBytes(SignatureUtils.CHARSET);
        SecretKeySpec secretKeySpec = new SecretKeySpec(secretKeyBytes, SignatureUtils.HMAC_SHA256);
        Mac mac = (Mac) SignatureUtils.MAC.clone();
        mac.init(secretKeySpec);
        return Base64.getEncoder().encodeToString(mac.doFinal(preHash.getBytes(SignatureUtils.CHARSET)));
    }

    /**
     * Ws signature
     *
     * @param timestamp
     * @param secretKey
     * @return
     */
    public static String wsGenerateSign(String timestamp, String secretKey) throws CloneNotSupportedException,
            InvalidKeyException, UnsupportedEncodingException {
        String preHash = timestamp + "GET" + "/user/verify";
        byte[] secretKeyBytes = secretKey.getBytes(SignatureUtils.CHARSET);
        SecretKeySpec secretKeySpec = new SecretKeySpec(secretKeyBytes, SignatureUtils.HMAC_SHA256);
        Mac mac = (Mac) SignatureUtils.MAC.clone();
        mac.init(secretKeySpec);
        return Base64.getEncoder().encodeToString(mac.doFinal(preHash.getBytes(SignatureUtils.CHARSET)));
    }
}