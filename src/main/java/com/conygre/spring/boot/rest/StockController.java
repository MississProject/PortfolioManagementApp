package com.conygre.spring.boot.rest;
import com.conygre.spring.boot.entities.Stock;
import com.conygre.spring.boot.services.Stock.StockService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stock")
@CrossOrigin // allows requests from all domains
public class StockController {
    
    @Autowired
    private StockService service;

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Stock> findAll() {
        return service.getAllStocks();
    }

    @RequestMapping(method = RequestMethod.GET, value="/{stock_symbol}")
    public List<Stock> getStockByID(@PathVariable("stock_symbol") String stock_symbol) {
        return service.getStockByID(stock_symbol);
    }

    @RequestMapping(method = RequestMethod.GET, value="/price/{stock_symbol}")
    public Double getStockPrice(@PathVariable("stock_symbol") String stock_symbol) {
        return service.getStockPrice(stock_symbol);
    }

}
