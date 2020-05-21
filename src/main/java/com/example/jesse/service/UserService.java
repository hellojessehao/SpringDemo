package com.example.jesse.service;

import com.example.jesse.bean.UserBean;

import org.springframework.data.elasticsearch.annotations.Mapping;

import java.util.List;

/**
 * @Description: user表接口
 * @author: zhangshihao
 * @date: 2020/5/21
 */
public interface UserService {

    public List<UserBean> getAllUser();

}
