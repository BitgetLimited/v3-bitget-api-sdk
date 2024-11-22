package com.bitget.openapi.common.utils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.Inflater;

public class ZipUtil {

    public static String uncompress(byte[] input) throws IOException {
        Inflater inflater = new Inflater(true);
        inflater.setInput(input);
        ByteArrayOutputStream baos = new ByteArrayOutputStream(input.length);
        try {
            byte[] buff = new byte[1024];
            while (!inflater.finished()) {
                int count = inflater.inflate(buff);
                baos.write(buff, 0, count);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            baos.close();
        }
        inflater.end();
        byte[] output = baos.toByteArray();
        return new String(output, "UTF-8");
    }
}