package com.example.jesse.controller;

import com.example.jesse.base.Constant;
import com.example.jesse.bean.ListObject;
import com.example.jesse.bean.UserBean;
import com.example.jesse.service.UserService;
import com.example.jesse.service.impl.UserServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @Description:
 * @author: zhangshihao
 * @date: 2020/5/13
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("/getData")
    @ResponseBody
    public String getData(){
        return "some datas";
    }

    @RequestMapping("/getUser")
    @ResponseBody
    public ListObject getUser(){
        ListObject listObject = new ListObject();
        listObject.setCode(Constant.CODE_SUCCESS);
        listObject.setMsg(Constant.MSG_SUCCESS);
        List<UserBean> userBeanList = jdbcTemplate.query("SELECT * FROM user", new UserRowMapper());
        listObject.setItems(userBeanList);
        return listObject;
    }

    class UserRowMapper implements RowMapper<UserBean> {

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
    }

}
