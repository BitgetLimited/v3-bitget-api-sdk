package com.bitget.openapi.common.utils;

import org.apache.commons.lang3.StringUtils;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.management.RuntimeErrorException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

/**
 *
 * @author bitget-sdk-team
 * @date 2019-01-15
 */
public class SignatureUtils {
    private static final String HMAC_SHA256 = "HmacSHA256";
    private static final String CHARSET = "UTF-8";
    private static Mac MAC;

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
        System.out.println(preHash);
        byte[] secretKeyBytes = secretKey.getBytes(SignatureUtils.CHARSET);
        SecretKeySpec secretKeySpec = new SecretKeySpec(secretKeyBytes, SignatureUtils.HMAC_SHA256);
        Mac mac = (Mac) SignatureUtils.MAC.clone();
        mac.init(secretKeySpec);
        return Base64.getEncoder().encodeToString(mac.doFinal(preHash.getBytes(SignatureUtils.CHARSET)));
    }

    /**
     * websocket Signature encryption
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
     * @param timestamp
     * @param secretKey
     * @return
     */
    public static  String wsGenerateSign(String timestamp,String secretKey)throws  CloneNotSupportedException,
            InvalidKeyException, UnsupportedEncodingException{
        String preHash = timestamp + "GET" + "/user/verify";
        byte[] secretKeyBytes = secretKey.getBytes(SignatureUtils.CHARSET);
        SecretKeySpec secretKeySpec = new SecretKeySpec(secretKeyBytes, SignatureUtils.HMAC_SHA256);
        Mac mac = (Mac) SignatureUtils.MAC.clone();
        mac.init(secretKeySpec);
        return Base64.getEncoder().encodeToString(mac.doFinal(preHash.getBytes(SignatureUtils.CHARSET)));
    }

    public static void main(String[] args) throws Exception {
        String msg = generate("1606981450", "GET", "/user/verify", null, null, "9ae40dd0f6074f9e2714e3ef9f9ed0ac33a049d85a38c02cc42873f03308f1fa");
        System.out.println(msg);


        String msg1 = generate("1674363384733", "POST", "/api/mix/v1/plan/placePlan", null, "{“symbol”: “SBTCSUSDT_SUMCBL”,“marginCoin”: “SUSDT”,“size”: “10”, “triggerPrice”: “11000”,“side”: “open_long”,“orderType”: “market”,“triggerType”: “market_price”,“clientOid”: “BITGET#8486913695”,“presetTakeProfitPrice”: “13000”,“presetStopLossPrice”: “10500”,“timeInForceValue”: “normal”}", "8c1e6b243cc08f7450b3ab48956af4797e7887e3a73dfe582edc75917b726bad");
        System.out.println(msg1);

    }

}
