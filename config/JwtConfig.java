package com.webModule.webService.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.webModule.webService.service.JwtManagerService;

@Configuration
public class JwtConfig {
	@Value("${jwt.secret}")
	private String jwtSecret;
	
	@Value("${jwt.access-token-validity-in-seconds}")
    private long tokenValidityInSeconds;    
    @Bean
    public JwtManagerService jwtManager() {
        return new JwtManagerService(jwtSecret, tokenValidityInSeconds);
    }
}
