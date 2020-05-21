package com.example.jesse.service.impl;

import com.example.jesse.bean.UserBean;
import com.example.jesse.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @Description:
 * @author: zhangshihao
 * @date: 2020/5/21
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<UserBean> getAllUser() {
        return jdbcTemplate.queryForList("SELECT * FROM user", UserBean.class);
    }

}
