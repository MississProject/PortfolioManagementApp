package com.conygre.spring.boot.entities;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="stocks")
public class Stock implements Serializable {

    @Id
    @Column(name="stock_symbol")
    private String stock_symbol;

    public String getStock_symbol() {
        return this.stock_symbol;
    }

    public void setStock_symbol(String stock_symbol) {
        this.stock_symbol = stock_symbol;
    }

    @Column(name="stock_name") private String stock_name;

    public String getStock_name() {
        return this.stock_name;
    }

    public void setStock_name(String stock_name) {
        this.stock_name = stock_name;
    };


    @Column(name="stock_price") private Double stock_price;

    public Double getStock_price() {
        return this.stock_price;
    }

    public void setStock_price(Double stock_price) {
        this.stock_price = stock_price;
    };

    public Stock(){}

    public Stock(String stock_symbol, String stock_name, Double stock_price){
        this.stock_symbol = stock_symbol;
        this.stock_name = stock_name;
        this.stock_price = stock_price;
    }

    


}
