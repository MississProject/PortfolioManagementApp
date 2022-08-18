package com.conygre.spring.boot.repos;
import com.conygre.spring.boot.entities.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepository extends JpaRepository<Stock, Integer> {
    // get all stocks
    // get stock by id
    @Query("SELECT * FROM stocks where stock_symbol=:stock_symbol")
    Stock getStockByID(@Param("stock_symbol") String stock_symbol);
    // get stock price
    @Query("SELECT stock_price FROM stocks where stock_symbol=:stock_symbol")
    Double getStockPrice(@Param("stock_symbol") String stock_symbol);
}
