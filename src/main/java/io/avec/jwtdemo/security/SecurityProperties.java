package io.avec.jwtdemo.security;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Component
public class SecurityProperties {
    @Value("${auth-login-url}")
    private String authLoginUrl;

    @Value("${jwt.secret}")
    private String jwtSecret;

    @Value("${token.header}")
    private String tokenHeader;

    @Value("${token.prefix}")
    private String tokenPrefix;

    @Value("${token.type}")
    private String tokenType;

    @Value("${token.issuer}")
    private String tokenIssuer;

    @Value("${token.audience}")
    private String tokenAudience;
}
