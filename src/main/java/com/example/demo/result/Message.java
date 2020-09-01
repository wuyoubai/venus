package com.example.demo.result;

public class Message {
    private int code;
    private String msg;

    /**
     * 100XX系统异常
     */
    public static Message RE_LOGIN = new Message(10000,"请重新登录");


    /**
     * 101XX 用户模块
     */
    public static Message DUPLICATE_USERNAME = new Message(10100,"用户名已存在");
    public static Message NO_PERMISSION = new Message(10101,"没有权限");
    public static Message UNKNOWN_ACCOUNT = new Message(10102,"用户还没注册");
    public static Message INCORRECT_PASSWORD = new Message(10103,"密码不正确");
    public static Message INCORRECT_OLD_PASSWORD = new Message(10104,"旧密码不正确");


    /**
     * 102XX 微信小程序模块
     */
    public static Message WX_RELOGIN = new Message(10200,"请重新登陆");
    public static Message NO_PARAM_THIRD_SESSION = new Message(10201,"缺少参数third_session");
    public static Message WX_SESSION_EXPIRES = new Message(10202,"session 过期");

    /**
     * 103XX 企业模块
     */
    public static Message DUPLICATE_GROUP = new Message(10300,"企业名重复");
    public static Message UNKNOWN_GROUP = new Message(10301,"该企业不存在");



    public Message(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

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
}
