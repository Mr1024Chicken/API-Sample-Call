package com.API1.api1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

import static org.springframework.http.HttpHeaders.USER_AGENT;

@Configuration
public class MyApplicationConfiguration {

    @Bean
    public WebClient myWebClient(WebClient.Builder webClientBuilder) {
        return webClientBuilder
                .baseUrl("https://api.lhasa.technology/rsi-signals")
                .defaultHeader("x-api-key", "KjfoVpvRN36soh3wOYhEq9RuMFuQG4BN1KHbFPMO")
                .defaultHeader("Content-Type", "application/json")
                .build();
    }
}
