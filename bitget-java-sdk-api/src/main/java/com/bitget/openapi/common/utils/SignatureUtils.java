package com.bitget.openapi.common.utils;

import org.apache.commons.lang3.StringUtils;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.management.RuntimeErrorException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.*;
import java.security.spec.PKCS8EncodedKeySpec;
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
     * Rest HMAC签名算法
     *
     * @param timestamp
     * @param method
     * @param requestPath
     * @param queryString
     * @param body
     * @param secretKey
     * @return java.lang.String
     * @description ACCESS-SIGN的请求头是对 timestamp + method + requestPath
     * + "?" + queryString + body 字符串(+表示字符串连接)使用 HMAC SHA256 方法加密，通过BASE64 编码输出而得到的。
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
     * Rest RSA签名算法
     * @param timestamp
     * @param method
     * @param requestPath
     * @param queryString
     * @param body
     * @param secretKey
     * @return
     * @throws CloneNotSupportedException
     * @throws InvalidKeyException
     * @throws UnsupportedEncodingException
     */
    public static String restGenerateRsaSignature(String timestamp, String method, String requestPath,
                                  String queryString, String body, String secretKey)
            throws CloneNotSupportedException, InvalidKeyException, UnsupportedEncodingException {

        method = method.toUpperCase();
        body = StringUtils.defaultIfBlank(body, StringUtils.EMPTY);
        queryString = StringUtils.isBlank(queryString) ? StringUtils.EMPTY : "?" + queryString;

        String preHash = timestamp + method + requestPath + queryString + body;
        System.out.println(preHash);
        return genRsaSignature(preHash, secretKey);
    }

    /**
     * websocket 签名加密
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
     * ws HMAC签名
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

    /**
     * ws RSA签名
     * @param timestamp
     * @param secretKey
     * @return
     */
    public static  String wsGenerateRsaSignature(String timestamp,String secretKey)throws  CloneNotSupportedException,
            InvalidKeyException, UnsupportedEncodingException{
        String preHash = timestamp + "GET" + "/user/verify";
        return genRsaSignature(preHash, secretKey);
    }

    public static String genRsaSignature(String content, String privateKey) {
        try {
            String parsedPem = privateKey.replace("\n", "").trim();
            parsedPem = parsedPem
                    .replace("-----BEGIN PRIVATE KEY-----", "")
                    .replace("-----END PRIVATE KEY-----", "");
            PKCS8EncodedKeySpec priPKCS8 = new PKCS8EncodedKeySpec(Base64.getDecoder().decode(parsedPem.getBytes("UTF-8")));
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            PrivateKey priKey = keyFactory.generatePrivate(priPKCS8);
            Signature signature = Signature.getInstance("SHA256WithRSA");
            signature.initSign(priKey);
            signature.update(content.getBytes(StandardCharsets.UTF_8));
            String sign = new String(Base64.getEncoder().encode(signature.sign()), "UTF-8");
            return sign;
        } catch (Exception ex) {
            throw new RuntimeException("create sign  failed", ex);
        }
    }
}
