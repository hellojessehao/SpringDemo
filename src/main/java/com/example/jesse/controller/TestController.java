package com.example.jesse.controller;

import com.example.jesse.bean.UserBean;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @author: zhangshihao
 * @date: 2020/5/13
 */
@Controller
public class TestController {

    @RequestMapping("/getPage")
    public String getPage(){
        return "pageone";
    }

    @RequestMapping("/getData")
    @ResponseBody
    public String getData(){
        return "some datas";
    }

    @RequestMapping("/getUser")
    @ResponseBody
    public UserBean getUser(){
        UserBean userBean = new UserBean();
        userBean.setCode(0);
        userBean.setMsg("success");
        UserBean.DataBean dataBean = new UserBean.DataBean();
        dataBean.setNumber(1);
        dataBean.setName("Jesse");
        dataBean.setGrade(3);//三年级
        dataBean.setClassX(3);//三班
        userBean.setData(dataBean);
        return userBean;
    }

}
