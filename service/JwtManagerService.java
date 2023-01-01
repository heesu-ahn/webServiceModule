package com.webModule.webService.service;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Date;
import java.util.Set;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import lombok.Getter;

public class JwtManagerService {
	
	private String secretKey;
    private long TOKEN_VALIDATiON_SECOND = 60;

    public JwtManagerService(String secretKey, long TOKEN_VALIDATiON_SECOND) {
        this.secretKey = secretKey;
        this.TOKEN_VALIDATiON_SECOND = TOKEN_VALIDATiON_SECOND;
    }
	
    private Key getSigninKey() {
        byte[] keyBytes = secretKey.getBytes(StandardCharsets.UTF_8);
        return Keys.hmacShaKeyFor(keyBytes);
    }
    
    // JWT 생성
    public String generateToken(String loginID, String password ) {
        Claims claims = Jwts.claims();
        claims.put("loginID", loginID);
        claims.put("password", password);

        return Jwts.builder()
                .setClaims(claims)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + (TOKEN_VALIDATiON_SECOND * 1000)))
                .signWith(getSigninKey(), SignatureAlgorithm.HS256)
                .compact();
    }
    
    // JWT 파싱
    public TokenInfo getTokenInfo(String token) {
        Claims body = getClaims(token);
        Set<String> keySet = body.keySet();
        for (String s : keySet) {
            System.out.println("s = " + s);
        }

        String loginID = body.get("loginID", String.class);
        String password = body.get("password", String.class);
        Date issuedAt = body.getIssuedAt();
        Date expiration = body.getExpiration();
        return new TokenInfo(loginID, password, issuedAt, expiration);
    }
    
    private Claims getClaims(String token) {
        Claims body = Jwts.parserBuilder()
                .setSigningKey(getSigninKey())
                .build()
                .parseClaimsJws(token)
                .getBody();
        return body;
    }


    @Getter
    public class TokenInfo {
        private String loginID;
        private String password;
        private Date issuedAt;
        private Date expire;

        public TokenInfo(String loginID, String password, Date issuedAt, Date expire) {
        	this.loginID = loginID;
        	this.password = password;
            this.issuedAt = issuedAt;
            this.expire = expire;
        }
    }

}
