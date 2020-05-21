package com.example.jesse.service.dao;

import com.example.jesse.bean.UserBean;
import com.example.jesse.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @Description:
 * @author: zhangshihao
 * @date: 2020/5/21
 */
@Component
public class UserDao implements UserService{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<UserBean> getAllUser() {
        return jdbcTemplate.query("SELECT * FROM user", new RowMapper<UserBean>() {
            @Override
            public UserBean mapRow(ResultSet resultSet, int i) throws SQLException {
                UserBean stu = new UserBean();
                stu.setId(resultSet.getInt("id"));
                stu.setAge(resultSet.getInt("age"));
                stu.setSex(resultSet.getInt("sex"));
                stu.setName(resultSet.getString("name"));
                stu.setBirthday(resultSet.getString("birthday"));
                stu.setMobile(resultSet.getString("mobile"));
                stu.setAddress(resultSet.getString("address"));
                return stu;
            }
        });
    }
}
