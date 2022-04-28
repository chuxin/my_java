package com.demo.dao;

import com.demo.entity.Account;
import java.math.BigDecimal;

public interface AccountDao {
    Account selectByUserId(String userId);

    int decrease(String userId, BigDecimal money);
}
