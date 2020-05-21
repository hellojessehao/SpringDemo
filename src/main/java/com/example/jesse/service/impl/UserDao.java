package com.example.jesse.service.impl;

import com.example.jesse.bean.UserBean;
import com.example.jesse.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

import javax.annotation.Resource;

/**
 * @Description:
 * @author: zhangshihao
 * @date: 2020/5/21
 */
@Component
public class UserDao implements UserService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<UserBean> getAllUser() {
        return jdbcTemplate.queryForList("SELECT * FROM user",UserBean.class);
    }
}
