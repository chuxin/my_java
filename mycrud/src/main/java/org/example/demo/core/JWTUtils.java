package org.example.demo.core;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.util.Calendar;
import java.util.Map;

public class JWTUtils {
    private static final String SECRET_KEY = "hello jwt #$%^&*";

    // 加密 token
    public static String generateToken(Map<String, String> payload) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.HOUR, 24);
        JWTCreator.Builder builder = JWT.create();
        payload.forEach(builder::withClaim);
        String token = builder.withExpiresAt(calendar.getTime()).sign(Algorithm.HMAC256(SECRET_KEY));

        return token;
    }

    // 解密 token
    public static DecodedJWT decodeToken(String token) {
        JWTVerifier jwtVerifier = JWT.require(Algorithm.HMAC256(SECRET_KEY)).build();
        DecodedJWT decodedJWT = jwtVerifier.verify(token);
        return decodedJWT;
    }
}
