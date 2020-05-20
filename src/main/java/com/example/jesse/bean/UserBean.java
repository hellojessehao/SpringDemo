package com.example.jesse.bean;


import com.google.gson.annotations.SerializedName;

/**
 * @Description: 用户数据bean
 * @author: zhangshihao
 * @date: 2020/5/15
 */
public class UserBean {

    /**
     * code : 123
     * msg : success
     * data : {"number":1,"name":"zsh","class":3,"grade":3}
     */

    private int code;
    private String msg;
    private DataBean data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * number : 1
         * name : zsh
         * class : 3
         * grade : 3
         */

        private int number;
        private String name;
        @SerializedName("class")
        private int classX;
        private int grade;

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getClassX() {
            return classX;
        }

        public void setClassX(int classX) {
            this.classX = classX;
        }

        public int getGrade() {
            return grade;
        }

        public void setGrade(int grade) {
            this.grade = grade;
        }
    }
}
