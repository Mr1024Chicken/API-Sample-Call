package com.API1.api1;

import com.API1.api1.domain.anindoStock;
import com.API1.api1.domain.anindoStockRequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.ArrayList;


@RestController("FirstAPI")
public class firstAPIController {
    @Autowired
    private firstAPIRespository apiRepo;

    @GetMapping(value = "/hello",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> firstAPI(){
        return new ResponseEntity<>("$$$$ Hello World $$$$", HttpStatus.OK);
    }

    @GetMapping(value = "/anindoStock")
    public ResponseEntity<Mono<anindoStock>> getStock(
            @RequestParam String ticker,
            @RequestParam double year,
            @RequestParam double sma,
            @RequestParam double span,
            @RequestParam double rsi_buy,
            @RequestParam double rsi_sell,
            @RequestParam double profit_margin
            ){
        anindoStockRequestBody requestBody = new anindoStockRequestBody(ticker,year,sma,span,rsi_buy,rsi_sell,profit_margin);
        return new ResponseEntity<>(apiRepo.getStock(requestBody),HttpStatus.OK);
    }
}
