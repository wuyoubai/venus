package com.example.demo.controller;

import com.example.demo.bean.User;
import com.example.demo.result.Message;
import com.example.demo.result.Result;
import com.example.demo.service.interfaces.UserService;
import com.example.demo.utils.CommonConst;
import com.example.demo.utils.CommonUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
public class LoginController {

    @Resource
    private UserService userService;

    @PostMapping("/login")
    public Result login(User Luser, HttpServletRequest request){
        User user = userService.selectUserByUsername(Luser.getUsername());
        if(user == null){
            return Result.buildBaseFail(Message.UNKNOWN_ACCOUNT);//用户名不存在
        }
        if(user.getIsdel() == 1){
            return  Result.buildBaseFail(Message.NO_PERMISSION);//用户失效
        }
        if(!StringUtils.isEmpty(user.getPassword()) && user.getPassword().equals(Luser.getPassword())){
            request.getSession().setAttribute(CommonConst.SESSION_KEY, user);
            return Result.buildBaseSuccess();
        }else{
            return Result.buildBaseFail(Message.INCORRECT_PASSWORD);//密码不正确
        }
    }

    @GetMapping("/logout")
    public Result logout(HttpServletRequest request){
        request.getSession().removeAttribute(CommonConst.SESSION_KEY);
        return Result.buildBaseSuccess();

    }

    @GetMapping("/isLogin")
    public Result isLogin(HttpServletRequest request){
        User user = CommonUtils.sessionUser(request);
        Map<String, Object> loginStatus = new HashMap<>();
        if(user != null){
            loginStatus.put("status", 0);//0已登录 1未登录
            loginStatus.put("msg", "已登录");
            loginStatus.put("username", user.getRealname());
        }else{
            loginStatus.put("status", 1);//0已登录 1未登录
            loginStatus.put("msg", "未登录");
            loginStatus.put("username", null);
        }
        return Result.buildBaseSuccess(loginStatus);

    }

    @GetMapping("/reLogin")
    public Result reLogin(){
        return Result.buildBaseFail(Message.RE_LOGIN);//重新登陆

    }

    @PostMapping("/updatePassword")
    public Result updatePassword(User bgUser, HttpServletRequest request){
        User sessionUser = CommonUtils.sessionUser(request);
        User user = userService.selectUserByUserId(sessionUser.getId());
        if(user.getPassword().equals(bgUser.getOldPassword())){
            bgUser.setId(sessionUser.getId());
            userService.updatePassword(bgUser);
        }else{
            return Result.buildBaseFail(Message.INCORRECT_OLD_PASSWORD);//旧密码不正确
        }
        return Result.buildBaseSuccess();
    }

}
