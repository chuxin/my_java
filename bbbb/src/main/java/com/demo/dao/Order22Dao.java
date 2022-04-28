package com.demo.dao;

import com.demo.entity.Order22;

public interface Order22Dao {
    int CreateOrder(Order22 order22);

    void updateOrderStatus(String orderId, Integer status);
}
