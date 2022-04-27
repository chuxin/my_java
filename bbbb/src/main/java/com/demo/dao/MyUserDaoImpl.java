package com.demo.dao;

import com.demo.entity.MyUser;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class MyUserDaoImpl implements MyUserDao {
    @Resource
    private JdbcTemplate jdbcTemplate;
//    @Resource
//    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public int addMyUser(MyUser myUser) {
        String sql = "insert into `my_user` (`my_user`.user_name, `my_user`.`status`) values (?, ?);";
        int update = jdbcTemplate.update(sql, myUser.getUserName(), myUser.getStatus());
        return update;
    }

    @Override
    public int updateMyUser(MyUser myUser) {
        String sql = "UPDATE `my_user` SET status=? WHERE user_name=?;";
        return jdbcTemplate.update(sql, myUser.getStatus(), myUser.getUserName());
    }

    @Override
    public int delete(MyUser myUser) {
        String sql = "DELETE FROM `my_user` where user_name=?;";
        return jdbcTemplate.update(sql, myUser.getUserName());
    }

    @Override
    public int count(MyUser myUser) {
        String sql = "SELECT COUNT(*) FROM `my_user` where `status`=?;";
        return jdbcTemplate.queryForObject(sql, Integer.class, myUser.getStatus());
    }

    @Override
    public List<MyUser> getList(MyUser myUser) {
        String sql = "SELECT * FROM `my_user` where `status`=?;";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<MyUser>(MyUser.class), myUser.getStatus());
    }

    @Override
    public MyUser getMyUser(MyUser myUser) {
        String sql = "SELECT * FROM `my_user` where `user_id`=?;";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<MyUser>(MyUser.class), myUser.getUserId());
    }

    @Override
    public void batchAddMyUser(List<Object[]> batchArgs) {
        String sql = "INSERT into `my_user` (`my_user`.user_name,`my_user`.`status`) VALUES(?,?);";
        jdbcTemplate.batchUpdate(sql, batchArgs);
    }
}
