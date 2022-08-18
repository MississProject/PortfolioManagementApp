package com.conygre.spring.boot.services;

import com.conygre.spring.boot.entities.Stock;
import com.conygre.spring.boot.repos.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StockServiceImpl implements StockService{
   
    @Autowired
    private StockRepository dao;

    @Transactional(propagation = Propagation.REQUIRED)
    public Iterable<Stock> getAllStocks() {
        return dao.findAll();
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public Stock getStockByID(String stock_symbol) {
        return dao.getStockByID(stock_symbol);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public Double getStockPrice(String stock_symbol) {
        return dao.getStockPrice(stock_symbol);
    }


}
