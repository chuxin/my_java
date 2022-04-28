package com.demo.dao;

import com.demo.entity.Storage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StorageDaoImpl implements StorageDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Storage selectByProductId(String productId) {
        String sql = "select * from storage where product_id = ?";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Storage>(Storage.class), productId);
    }

    @Override
    public int decrease(Storage record) {
        String sql = "update storage set used=?, residue=? where product_id=?";
        return jdbcTemplate.update(sql, record.getUsed(), record.getResidue(), record.getProductId());
    }
}
