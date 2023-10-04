package com.example.demo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@ConfigurationProperties(prefix = "my-service")
@Component
public class MyServiceConfiguration {
    private String url;
    private String username;
    private String key;
}
