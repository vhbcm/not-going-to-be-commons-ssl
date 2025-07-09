package org.apache.commons.ssl.util;

import java.nio.charset.StandardCharsets;

public class UTF8 {

    public static String toString(byte[] bytes) {
        return new String(bytes, StandardCharsets.UTF_8);
    }

    public static byte[] toBytes(String s) {
        return s.getBytes(StandardCharsets.UTF_8);
    }
}
