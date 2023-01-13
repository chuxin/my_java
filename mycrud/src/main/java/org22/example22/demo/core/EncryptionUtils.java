package org22.example22.demo.core;

public class EncryptionUtils {

    public static String bytesToHexString(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        if (bytes == null || bytes.length <= 0) {
            return null;
        }
        for (byte a : bytes) {
            int v = a & 0xFF;
            String hv = Integer.toHexString(v);
            if(hv.length() < 2) {
                sb.append(0);
            }
            sb.append(hv);
        }

        return sb.toString();
    }
}
