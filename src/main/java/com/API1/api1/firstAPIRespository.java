package com.API1.api1;

import com.API1.api1.domain.anindoStock;
import com.API1.api1.domain.anindoStockRequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.ArrayList;

@Repository
public class firstAPIRespository {


    @Autowired
    private WebClient myWebClient;

    public Mono<anindoStock> getStock(anindoStockRequestBody requestBody ){
        System.out.println(requestBody);
        return myWebClient.post().body(Mono.just(requestBody), anindoStockRequestBody.class).retrieve().bodyToMono(anindoStock.class);
    }
}
