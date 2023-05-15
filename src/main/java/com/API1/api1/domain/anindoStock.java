package com.API1.api1.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class anindoStock {
    public anindoStock(Integer statusCode, String description, String ticker, List<stock> tradeDetails) {
        this.statusCode = statusCode;
        this.description = description;
        this.ticker = ticker;
        this.tradeDetails = tradeDetails;
    }

    @JsonProperty("statusCode")
    public Integer statusCode;
    @JsonProperty("DESCRIPTION")
    public String description;
    @JsonProperty("TICKER")
    public String ticker;
    @JsonProperty("TRADE DETAILS")
    public List<stock> tradeDetails;

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public List<stock> getTradeDetails() {
        return tradeDetails;
    }

    public void setTradeDetails(List<stock> tradeDetails) {
        this.tradeDetails = tradeDetails;
    }
}
