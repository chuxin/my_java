package com.demo.service;

import com.demo.dao.AccountDao;
import com.demo.dao.Order22Dao;
import com.demo.dao.StorageDao;
import com.demo.entity.Account;
import com.demo.entity.Order22;
import com.demo.entity.Storage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service("order22Service")
public class Order22ServiceImpl implements Order22Service {
    @Autowired
    private Order22Dao order22Dao;
    @Autowired
    private AccountDao accountDao;
    @Autowired
    private StorageDao storageDao;

    @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED, timeout = 10, readOnly = false)
    @Override
    public void createOrder(Order22 order22) {
        // 自动生成订单id
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        String format = df.format(new Date());
        String orderId = order22.getUserId() + "-" + order22.getProductId() + "-" + format;
        System.out.println("自动生成的订单ID为：" + orderId);
        order22.setOrderId(orderId);
        System.out.println("开始创建订单数据，订单号为：" + orderId);

        // 创建订单数据
        order22Dao.CreateOrder(order22);
        System.out.println("订单数据创建成功，订单号为：" + orderId);

        // 查询库存
        System.out.println("开始查询商品库存，商品 id 为：" + order22.getProductId());
        Storage storageObj = storageDao.selectByProductId(order22.getProductId());
        if (storageObj != null && storageObj.getResidue().intValue() >= order22.getCount().intValue()) {
            System.out.println("库存充足，正在扣减商品库存");
            storageObj.setUsed(storageObj.getUsed() + order22.getCount());
            storageObj.setResidue(storageObj.getTotal().intValue() - storageObj.getUsed());
            int decrease = storageDao.decrease(storageObj);
            System.out.println("商品库存扣减完成");
        } else {
            System.out.println("警告：商品库存不足，正在执行回滚操作");
            throw new RuntimeException("库存不足啊啊啊");
        }

        // 查询用户账户金额
        System.out.println("开始查询用户的账户金额");
        Account account = accountDao.selectByUserId(order22.getUserId());
        if (account != null && account.getResidue().intValue() >= order22.getMoney().intValue()) {
            System.out.println("账户金额充足，正在扣减账户金额");
            accountDao.decrease(order22.getUserId(), order22.getMoney());
            System.out.println("账户金额扣减完成");
        } else {
            System.out.println("警告：账户余额不足，正在执行回滚操作！");
            throw new RuntimeException("账户余额不足");
        }

        System.out.println("开始修改订单状态，未完成 -> 已完成");
        order22Dao.updateOrderStatus(order22.getOrderId(), 0);
        System.out.println("修改订单状态完成！");
    }
}
