package com.example.demo.controller;

import com.example.demo.bean.Group;
import com.example.demo.bean.vo.PageQO;
import com.example.demo.result.Result;
import com.example.demo.service.interfaces.GroupService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
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
        List<Group> groups = groupService.getGroupList(group);
        return Result.buildPageSuccess(page, groups);
    }

    @GetMapping("/groupRemind")
    public Result groupRemind(PageQO pageQO, Group group, HttpServletRequest request){
        Page<Group> page = PageHelper.startPage(pageQO.getPageNum(), pageQO.getPageSize());
        List<Group> groups = groupService.getGroupList(group);
        return Result.buildPageSuccess(page, groups);
    }

}
