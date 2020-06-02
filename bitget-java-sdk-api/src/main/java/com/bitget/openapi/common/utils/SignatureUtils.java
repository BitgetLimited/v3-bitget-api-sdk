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

    public static String generate(String timestamp, String method, String requestPath,
                                  String queryString, String body, String secretKey)
            throws CloneNotSupportedException, InvalidKeyException, UnsupportedEncodingException {
        method = method.toUpperCase();
        body = StringUtils.defaultIfBlank(body, StringUtils.EMPTY);
        queryString = StringUtils.isBlank(queryString) ? "" : "?" + queryString;

        String preHash = timestamp + method + requestPath + queryString + body;
        byte[] secretKeyBytes = secretKey.getBytes(SignatureUtils.CHARSET);
        SecretKeySpec secretKeySpec = new SecretKeySpec(secretKeyBytes, SignatureUtils.HMAC_SHA256);
        Mac mac = (Mac) SignatureUtils.MAC.clone();
        mac.init(secretKeySpec);
        return Base64.getEncoder().encodeToString(mac.doFinal(preHash.getBytes(SignatureUtils.CHARSET)));
    }
}
