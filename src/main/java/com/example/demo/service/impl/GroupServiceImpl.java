package com.example.demo.service.impl;

import com.example.demo.bean.Group;
import com.example.demo.mapper.dao.GroupMapper;
import com.example.demo.service.interfaces.GroupService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: venus
 * @description: 企业维护实现类
 * @author: 拜无忧
 * @create: 2020-08-19
 */
@Service
public class GroupServiceImpl implements GroupService {
    @Resource
    private GroupMapper groupMapper;

    @Override
    public int addGroup(Group group) {
        return 0;
    }

    @Override
    public int editGroup(Group group) {
        return 0;
    }

    @Override
    public int delete(int id) {
        return 0;
    }

    @Override
    public Group getGroup(int id) {
        return null;
    }

    @Override
    public List<Group> getGroupList(Group group) {
        return groupMapper.getGroupList(group);
    }

    @Override
    public List<Group> getGroupExpiredList(Group group) {
        return groupMapper.getGroupExpiredList(group);
    }

    @Override
    public Group selectGroupByGroupname(String groupname) {
        return null;
    }

    @Override
    public Group selectGroupById(int id) {
        return null;
    }

    @Override
    public int updateIsdel(Group group) {
        return 0;
    }
}
