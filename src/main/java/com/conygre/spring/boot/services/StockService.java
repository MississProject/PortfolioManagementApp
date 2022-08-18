package com.conygre.spring.boot.services;

import com.conygre.spring.boot.entities.Stock;

import java.util.List;

public interface StockService {
    // get all stocks
    Iterable<Stock> getAllStocks();
    // get stock by id
    List<Stock> getStockByID(String stock_symbol);
    // get stock price
    Double getStockPrice(String stock_symbol);
}
