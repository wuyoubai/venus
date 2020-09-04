package com.example.demo.controller;

import com.example.demo.bean.Group;
import com.example.demo.bean.vo.PageQO;
import com.example.demo.result.Message;
import com.example.demo.result.Result;
import com.example.demo.service.interfaces.GroupService;
import com.example.demo.utils.CommonUtils;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @program: venus
 * @description: 企业维护
 * @author: 拜无忧
 * @create: 2020-08-19
 */
@RestController
public class GroupController {

    @Resource
    private GroupService groupService;

    @GetMapping("/listGroup")
    public Result listGroup(PageQO pageQO, Group group, HttpServletRequest request){
        Page<Group> page = PageHelper.startPage(pageQO.getPageNum(), pageQO.getPageSize());
        group.setIsdel(0);
        List<Group> groups = groupService.getGroupList(group);
        return Result.buildPageSuccess(page, groups);
    }

    @GetMapping("/groupRemind")
    public Result groupRemind(PageQO pageQO, Group group, HttpServletRequest request){
        Page<Group> page = PageHelper.startPage(pageQO.getPageNum(), pageQO.getPageSize());
        Date nowDate = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.MONTH,calendar.get(Calendar.MONTH)+1);
        nowDate = calendar.getTime();
        group.setContractEndTime(nowDate);
        List<Group> groups = groupService.getGroupExpiredList(group);
        return Result.buildPageSuccess(page, groups);
    }

    @PostMapping("/editGroup")
    public Result editGroup(Group group, HttpServletRequest request){
        int updator = CommonUtils.sessionUser(request).getId();
        if(groupService.getGroup(group.getId())==null){
            return Result.buildBaseFail(Message.UNKNOWN_GROUP);
        }
        group.setUpdator(updator);
        groupService.editGroup(group);
        return Result.buildBaseSuccess();
    }

    @PostMapping("/addGroup")
    public Result addGroup(Group group, HttpServletRequest request){
        if (groupService.selectGroupByGroupname(group.getGroupname()) != null){
            return Result.buildBaseFail(Message.DUPLICATE_GROUP);
        }
        int id = CommonUtils.sessionUser(request).getId();
        group.setCreator(id);
        group.setUpdator(id);
        Date date = new Date();
        group.setCreatetime(date);
        groupService.addGroup(group);
        return Result.buildBaseSuccess();
    }

    @PostMapping("/delGroup")
    public Result delGroup(Group group, HttpServletRequest request){
        if(groupService.getGroup(group.getId())==null){
            return Result.buildBaseFail(Message.UNKNOWN_GROUP);
        }
        group.setUpdator(CommonUtils.sessionUser(request).getId());
        group.setIsdel(1);
        groupService.updateIsdel(group);
        return Result.buildBaseSuccess();
    }
}
