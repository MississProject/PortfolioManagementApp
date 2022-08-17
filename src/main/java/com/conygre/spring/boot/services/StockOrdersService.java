package com.conygre.spring.boot.services;

import com.conygre.spring.boot.entities.StockOrder;

public interface StockOrdersService {
    // add an order
    StockOrder addNewStockOrder(StockOrder stockOrder);
    // get all orders
    Iterable<StockOrder> getAllOrders();
    // delete order by id
    void deleteStockOrder(int id);
    // delete all orders
    void deleteAllStockOrders();
    // get order by stock symbol
    StockOrder getStockOrderBySymbol(String stockSymbol);
    // updates an order
    void updateStockOrder(StockOrder stockOrder);
}
