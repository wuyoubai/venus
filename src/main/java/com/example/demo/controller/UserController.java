package com.example.demo.controller;

import com.example.demo.bean.User;
import com.example.demo.bean.vo.PageQO;
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
        int id = CommonUtils.sessionUser(request).getId();
        user.setCreator(id);
        user.setUpdator(id);
        Date date = new Date();
        user.setCreatetime(date);
        user.setUpdatetime(date);
        userService.addUser(user);
        return Result.buildBaseSuccess();
    }

    @PostMapping("/isdel")
    public Result isdel(User user, HttpServletRequest request){
        int updator = CommonUtils.sessionUser(request).getId();
        user.setUpdator(updator);
        userService.updateIsdel(user);
        return Result.buildBaseSuccess();
    }

    @GetMapping("/listAllUser")
    public Result listAllUser(PageQO pageQO, HttpServletRequest request){
            Page<User> page = PageHelper.startPage(pageQO.getPageNum(), pageQO.getPageSize());
            List<User> users = userService.getUserList();
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
