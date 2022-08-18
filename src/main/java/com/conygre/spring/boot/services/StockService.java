package com.conygre.spring.boot.services;

import com.conygre.spring.boot.entities.Stock;

public interface StockService {
    // get all stocks
    Iterable<Stock> getAllStocks();
    // get stock by id
    Stock getStockByID(String stock_symbol);
    // get stock price
    Double getStockPrice(String stock_symbol);
}
