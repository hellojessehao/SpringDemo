package com.example.jesse.bean;

import com.example.jesse.base.Constant;

/**
 * 状态对象
 */
public class StatusObject {
	// 状态码
	private String code;
 
	// 状态信息
	private String msg;

	public StatusObject() {
	}

	public StatusObject(String code, String msg) {
		super();
		this.code = code;
		this.msg = msg;
	}

	public void setSuccess(){
		this.code = Constant.CODE_SUCCESS;
		this.msg = Constant.MSG_SUCCESS;
	}

	public String getCode() {
		return code;
	}
 
	public void setCode(String code) {
		this.code = code;
	}
 
	public String getMsg() {
		return msg;
	}
 
	public void setMsg(String msg) {
		this.msg = msg;
	}

}