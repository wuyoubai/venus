package com.example.demo.result;

import com.example.demo.bean.vo.PageVO;
import com.github.pagehelper.Page;

import java.util.List;

public class Result<E> {

    private Object data;
    private int code;
    private String msg;

    public static <E> Result<E> buildPageSuccess(Page<E> page, List<E> list){
        return build(0, "success", PageVO.build(page, list));
    }
    public static Result buildBaseSuccess(){
        return build(0, "success", null);
    }

    public static Result buildBaseSuccess(String msg){
        return build(0, msg, null);
    }

    public static Result buildBaseSuccess(Object data){
        return build(0, null, data);
    }

    public static Result buildBaseFail(String msg){
        return build(1, msg, null);
    }

    public static Result buildBaseFail(Message msg){
        return build(msg.getCode(), msg.getMsg(), null);
    }

    private static <E> Result<E> build(int code, String msg, Object data){
        Result<E> result = new Result<>();
        result.setCode(code);
        if(msg == null){
            result.setMsg("success");
        }else{
            result.setMsg(msg);
        }
        result.setData(data);
        return result;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
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
