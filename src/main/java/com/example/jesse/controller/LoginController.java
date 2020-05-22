package com.example.jesse.controller;

import com.example.jesse.base.Constant;
import com.example.jesse.bean.StatusObject;
import com.example.jesse.bean.UserBean;
import org.apache.http.util.TextUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description: 用户登录控制器
 * @author: zhangshihao
 * @date: 2020/5/22
 */
@Controller
public class LoginController {

    private static final String TAG = LoginController.class.getName();

    @RequestMapping("/toLogin")
    public String toLogin(){
        return "login";
    }

    @RequestMapping("/toRegister")
    public String toRegister(){
        return "register";
    }

    @RequestMapping("/register")
    @ResponseBody
    public StatusObject register(@RequestBody UserBean userBean){
        StatusObject statusObject = new StatusObject();

        return statusObject;
    }

    @RequestMapping("/login")
    @ResponseBody
    public StatusObject login(@RequestParam(name = "account") String account,
                      @RequestParam(name = "password") String password){
        StatusObject statusObject = new StatusObject();
        if(TextUtils.isEmpty(account)){
            statusObject.setCode(Constant.CODE_LOGIN_FAILED_ACCOUNT_EMPTY);
            statusObject.setMsg(Constant.MSG_LOGIN_ACCOUNT_EMPTY);
            return statusObject;
        }
        if(TextUtils.isEmpty(password)){
            statusObject.setCode(Constant.CODE_LOGIN_FAILED_PSW_EMPTY);
            statusObject.setMsg(Constant.MSG_LOGIN_PASSWORD_EMPTY);
            return statusObject;
        }
        return statusObject;
    }

}
