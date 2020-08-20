package com.example.demo.controller;

import com.example.demo.bean.GroupUser;
import com.example.demo.bean.User;
import com.example.demo.bean.vo.PageQO;
import com.example.demo.mapper.dao.GroupMapper;
import com.example.demo.result.Message;
import com.example.demo.result.Result;
import com.example.demo.service.interfaces.GroupService;
import com.example.demo.service.interfaces.GroupUserService;
import com.example.demo.utils.CommonUtils;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

/**
 * @program: venus
 * @description: 企业用户
 * @author: 拜无忧
 * @create: 2020-08-20
 */
@RestController
public class GroupUserController {

    @Resource
    private GroupUserService groupUserService;

    @Resource
    private GroupService groupService;

    @PostMapping("/addGroupUser")
    public Result addGroupUser(GroupUser groupUser, HttpServletRequest request){
        if (groupUserService.selectGroupUserByname(groupUser.getUsername()) != null){
            return Result.buildBaseFail(Message.DUPLICATE_USERNAME);
        }
        int id = CommonUtils.sessionUser(request).getId();
        groupUser.setCreator(id);
        groupUser.setUpdator(id);
        Date date = new Date();
        groupUser.setCreatetime(date);
        groupUser.setUpdatetime(date);
        groupUserService.addGroupUser(groupUser);
        return Result.buildBaseSuccess();
    }

    @PostMapping("/editGroupUser")
    public Result editGroupUser(GroupUser groupUser, HttpServletRequest request){
        if (groupUserService.selectGroupUserById(groupUser.getId()) == null){
            return Result.buildBaseFail(Message.DUPLICATE_USERNAME);
        }
        int id = CommonUtils.sessionUser(request).getId();
        groupUser.setUpdator(id);
        Date date = new Date();
        groupUser.setUpdatetime(date);
        groupUserService.updateGroupUser(groupUser);
        return Result.buildBaseSuccess();
    }

    @PostMapping("/groupUserIsdel")
    public Result isdel(GroupUser groupUser, HttpServletRequest request){
        int updator = CommonUtils.sessionUser(request).getId();
        if (groupUser.getIsdel() == 0){
            groupUser.setIsdel(1);
        } else {
            groupUser.setIsdel(0);
        }
        groupUser.setUpdator(updator);
        groupUserService.updateIsdel(groupUser);
        return Result.buildBaseSuccess();
    }

    @GetMapping("/listGroupUser")
    public Result listGroupUser(PageQO pageQO, GroupUser groupUser, HttpServletRequest request){
        Page<GroupUser> page = PageHelper.startPage(pageQO.getPageNum(), pageQO.getPageSize());
        groupUser.setRealname(groupUser.getUsername());
        groupUser.setIsdel(0);
        List<GroupUser> users = groupUserService.getGroupUserList(groupUser);
        for (GroupUser user : users) {
            Integer groupid = user.getGroupid();
            if (groupid != null){
                user.setGroupname(groupService.getGroup(user.getGroupid()).getGroupname());
            }
        }
        return Result.buildPageSuccess(page, users);
    }

}
