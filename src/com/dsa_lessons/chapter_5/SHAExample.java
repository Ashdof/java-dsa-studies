package com.dsa_lessons.chapter_5;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Demonstration of Secure Hash Algorithm (SHA)
 */

public class SHAExample {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        String input = "Emmanuel from Accra";

        // Create SHA-256 instance
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        // Compute hash
        byte[] hashBytes = digest.digest(input.getBytes(StandardCharsets.UTF_8));
        // Convert to hexadecimal string
        StringBuilder builder = new StringBuilder();
        for (byte b : hashBytes) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1)
                builder.append('0');
            builder.append(hex);
        }

        System.out.printf("Input:\t%s%nSHA-256:\t%s%n", input, builder);
    }
}
