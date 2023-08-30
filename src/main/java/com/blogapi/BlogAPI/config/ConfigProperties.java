package com.blogapi.BlogAPI.config;


import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("notion")
public record ConfigProperties(String AUTH_SECRET){
}
