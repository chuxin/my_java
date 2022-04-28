package com.demo.dao;

import com.demo.entity.Storage;

public interface StorageDao {
    Storage selectByProductId(String productId);

    int decrease(Storage record);
}
