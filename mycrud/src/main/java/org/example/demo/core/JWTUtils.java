package org.example.demo.core;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;

public class JWTUtils {
    private static final String SECRET_KEY = "hello jwt #$%^&*";

    // 加密 token
    public static String generateToken(Map<String, String> payload) {
        Calendar calendar = Calendar.getInstance();
//        calendar.add(Calendar.HOUR, 24);
        JWTCreator.Builder builder = JWT.create();
        payload.forEach(builder::withClaim);
        System.out.println(calendar.getTime());
        SimpleDateFormat dtf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String expiresAt = dtf.format(calendar.getTime());
        System.out.println(expiresAt);
        Date dd = null;
        try {
            dd = dtf.parse(expiresAt);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String token = builder.withExpiresAt(dd).sign(Algorithm.HMAC256(SECRET_KEY));

        return token;
    }

    // 解密 token
    public static DecodedJWT decodeToken(String token) {
        JWTVerifier jwtVerifier = JWT.require(Algorithm.HMAC256(SECRET_KEY)).build();
        DecodedJWT decodedJWT = jwtVerifier.verify(token);
        return decodedJWT;
    }
}
