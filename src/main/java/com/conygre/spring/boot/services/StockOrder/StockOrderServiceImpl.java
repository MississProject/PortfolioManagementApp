package com.conygre.spring.boot.services.StockOrder;

import com.conygre.spring.boot.entities.StockOrder;
import com.conygre.spring.boot.repos.Stock.StockRepository;
import com.conygre.spring.boot.repos.StockOrder.StockOrderRepository;

import com.conygre.spring.boot.repos.User.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Service
public class StockOrderServiceImpl implements StockOrderService {
    @Autowired
    private StockOrderRepository dao;
    @Autowired
    private StockRepository stockDao; // temp
    @Autowired
    private UserRepository userDao; // temp

    @Transactional(propagation = Propagation.REQUIRED)
    public Iterable<StockOrder> getAllOrders() {
        return dao.findAll();
    }

    @Override
    public StockOrder addNewStockOrder(StockOrder stockOrder) {
        // temp starts
        // need to calculate with price
        String stockSymbol = stockOrder.getStockSymbol();
        String userEmail = stockOrder.getUserEmail();
        double stockPrice = stockDao.getStockPrice(stockSymbol);
        double userBalance = userDao.getUserBalanceByEmail(userEmail);
        double newBalance = userBalance - stockOrder.getNumOfShares() * stockPrice;
        if (newBalance < 0){
            // no enough balance
            return null;
        }
        // temp ends
        stockOrder.setOrderID(0);
        userDao.setUserBalanceByEmail(newBalance, userEmail); // temp
        return dao.save(stockOrder);
    }

    @Override
    public void deleteStockOrder(int id) {
        StockOrder toBeDeleted = dao.findById(id).get();
        dao.delete(toBeDeleted);
    }

    @Override
    public void deleteAllStockOrders() {
        dao.deleteAll();
    }

    @Override
    public StockOrder getStockOrderBySymbol(String stockSymbol) {
        return null;
    }

    @Override
    public void updateStockOrder(StockOrder stockOrder) {

    }
}
