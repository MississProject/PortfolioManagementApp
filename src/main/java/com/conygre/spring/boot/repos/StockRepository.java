package com.conygre.spring.boot.repos;
import com.conygre.spring.boot.entities.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StockRepository extends JpaRepository<Stock, Integer> {
    // get all stocks
    // get stock by id
    @Query(value= "SELECT * FROM Stock where stock_symbol=:stock_symbol", nativeQuery = true)
    List<Stock> getStockByID(@Param("stock_symbol") String stock_symbol);
    // get stock price
    @Query("SELECT stock_price FROM Stock where stock_symbol=:stock_symbol")
    Double getStockPrice(@Param("stock_symbol") String stock_symbol);
}
