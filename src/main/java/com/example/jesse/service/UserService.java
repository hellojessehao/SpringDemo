package com.example.jesse.service;

import com.example.jesse.bean.UserBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.elasticsearch.annotations.Mapping;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @Description: user表接口
 * @author: zhangshihao
 * @date: 2020/5/21
 */
public interface UserService {

    List<UserBean> getAllUser();

}
