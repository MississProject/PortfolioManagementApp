package com.conygre.spring.boot.repos;

import com.conygre.spring.boot.entities.StockOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockOrdersRepository extends JpaRepository<StockOrder, Integer> {
    // get all orders
    // add an order
    // delete order by id
    // delete all orders
    // get order by stock symbol
    // updates an order
}
