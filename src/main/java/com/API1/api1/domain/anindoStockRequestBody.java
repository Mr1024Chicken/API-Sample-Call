package com.API1.api1.domain;

public class anindoStockRequestBody {
    private String ticker;
    private double year;
    private double sma;
    private double span;
    private double rsi_buy;
    private double rsi_sell;
    private double profit_margin;

    public anindoStockRequestBody() {
    }

    public anindoStockRequestBody(String ticker, double year, double sma, double span, double rsi_buy, double rsi_sell, double profit_margin) {
        this.ticker = ticker;
        this.year = year;
        this.sma = sma;
        this.span = span;
        this.rsi_buy = rsi_buy;
        this.rsi_sell = rsi_sell;
        this.profit_margin = profit_margin;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public double getYear() {
        return year;
    }

    public void setYear(double year) {
        this.year = year;
    }

    public double getSma() {
        return sma;
    }

    public void setSma(double sma) {
        this.sma = sma;
    }

    public double getSpan() {
        return span;
    }

    public void setSpan(double span) {
        this.span = span;
    }

    public double getRsi_buy() {
        return rsi_buy;
    }

    public void setRsi_buy(double rsi_buy) {
        this.rsi_buy = rsi_buy;
    }

    public double getRsi_sell() {
        return rsi_sell;
    }

    public void setRsi_sell(double rsi_sell) {
        this.rsi_sell = rsi_sell;
    }

    public double getProfit_margin() {
        return profit_margin;
    }

    public void setProfit_margin(double profit_margin) {
        this.profit_margin = profit_margin;
    }
}
