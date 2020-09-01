package com.example.demo.controller;

import com.example.demo.bean.User;
import com.example.demo.bean.vo.PageQO;
import com.example.demo.result.Message;
import com.example.demo.result.Result;
import com.example.demo.service.interfaces.UserService;
import com.example.demo.utils.CommonUtils;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

@RestController
public class UserController {

    @Resource
    private UserService userService;

    @PostMapping("/addUser")
    public Result addUser(User user, HttpServletRequest request){
        if (userService.selectUserByUsername(user.getUsername()) != null){
            return Result.buildBaseFail(Message.DUPLICATE_USERNAME);
        }
        int id = CommonUtils.sessionUser(request).getId();
        user.setCreator(id);
        user.setUpdator(id);
        userService.addUser(user);
        return Result.buildBaseSuccess();
    }

    @PostMapping("/editUser")
    public Result editUser(User user, HttpServletRequest request){
        if (userService.selectUserByUserId(user.getId()) == null){
            return Result.buildBaseFail(Message.DUPLICATE_USERNAME);
        }
        int id = CommonUtils.sessionUser(request).getId();
        user.setUpdator(id);
        userService.update(user);
        return Result.buildBaseSuccess();
    }

    @PostMapping("/isdel")
    public Result isdel(User user, HttpServletRequest request){
        int updator = CommonUtils.sessionUser(request).getId();
        if (user.getIsdel() == 0){
            user.setIsdel(1);
        } else {
            user.setIsdel(0);
        }
        user.setUpdator(updator);
        userService.updateIsdel(user);
        return Result.buildBaseSuccess();
    }

    @GetMapping("/listUser")
    public Result listAllUser(PageQO pageQO, User user, HttpServletRequest request){
            Page<User> page = PageHelper.startPage(pageQO.getPageNum(), pageQO.getPageSize());
            user.setRealname(user.getUsername());
            List<User> users = userService.getUserList(user);
            for (User u : users) {
                Integer creatorid = u.getCreator();
                Integer updatorid = u.getUpdator();
               if (creatorid != null && creatorid != 0){
                   u.setCreatorname(userService.selectUserByUserId(creatorid).getRealname());
               }
                if (updatorid != null && updatorid != 0){
                   u.setUpdatorname(userService.selectUserByUserId(updatorid).getRealname());
                }
            }
            return Result.buildPageSuccess(page, users);
    }

}
