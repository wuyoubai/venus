package com.example.demo.utils;

import com.example.demo.bean.User;

import javax.servlet.http.HttpServletRequest;

public class CommonUtils {

    public static User sessionUser(HttpServletRequest request){
        return (User)request.getSession().getAttribute(CommonConst.SESSION_KEY);
    }

}
