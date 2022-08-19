package com.conygre.spring.boot.rest;

import com.conygre.spring.boot.entities.Stock;
import com.conygre.spring.boot.entities.StockOrder;
import com.conygre.spring.boot.services.StockOrder.StockOrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/stockorders")
@CrossOrigin // allows requests from all domains
public class StockOrderController {
    @Autowired
    private StockOrderService service;

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<StockOrder> findAll() {
        return service.getAllOrders();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addCd(@RequestBody StockOrder order) {
        service.addNewStockOrder(order);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void deleteStockOrder(@PathVariable("id") int id) {
        service.deleteStockOrder(id);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void deleteAllStockOrders() {
        service.deleteAllStockOrders();
    }



}
