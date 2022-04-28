package com.demo.dao;

import com.demo.entity.Order22;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class Order22DaoImpl implements Order22Dao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int CreateOrder(Order22 order22) {
        String sql = "insert into `order22`(order_id, user_id, product_id, count, money, status) values" +
                " (?, ?, ?, ?, ?, ?)";
        int update = jdbcTemplate.update(sql, order22.getOrderId(), order22.getUserId(), order22.getProductId(),
                order22.getCount(), order22.getMoney(), order22.getStatus());
        return update;
    }

    @Override
    public void updateOrderStatus(String orderId, Integer status) {
        String sql = " update order22 set status = 1 where order_id = ? and status = ?;";
        jdbcTemplate.update(sql, orderId, status);
    }
}
