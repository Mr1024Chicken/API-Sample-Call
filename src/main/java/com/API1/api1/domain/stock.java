package com.API1.api1.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class stock {
    public stock(String tradePair, String buyDate, String buyPrice, String sellDate, String sellPrice, String profit) {
        this.tradePair = tradePair;
        this.buyDate = buyDate;
        this.buyPrice = buyPrice;
        this.sellDate = sellDate;
        this.sellPrice = sellPrice;
        this.profit = profit;
    }

    @JsonProperty("TRADE PAIR")
    public String tradePair;

    @JsonProperty("BUY DATE")
    public String buyDate;

    @JsonProperty("BUY PRICE")
    public String buyPrice;
    @JsonProperty("SELL DATE")
    public String sellDate;
    @JsonProperty("SELL PRICE")
    public String sellPrice;
    @JsonProperty("PROFIT")
    public String profit;

    public String getTradePair() {
        return tradePair;
    }

    public void setTradePair(String tradePair) {
        this.tradePair = tradePair;
    }

    public String getBuyDate() {
        return buyDate;
    }

    public void setBuyDate(String buyDate) {
        this.buyDate = buyDate;
    }

    public String getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(String buyPrice) {
        this.buyPrice = buyPrice;
    }

    public String getSellDate() {
        return sellDate;
    }

    public void setSellDate(String sellDate) {
        this.sellDate = sellDate;
    }

    public String getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(String sellPrice) {
        this.sellPrice = sellPrice;
    }

    public String getProfit() {
        return profit;
    }

    public void setProfit(String profit) {
        this.profit = profit;
    }

}
