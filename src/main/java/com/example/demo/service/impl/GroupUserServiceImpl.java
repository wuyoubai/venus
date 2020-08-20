package com.example.demo.service.impl;

import com.example.demo.bean.GroupUser;
import com.example.demo.mapper.dao.GroupUserMapper;
import com.example.demo.service.interfaces.GroupUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: venus
 * @description: 企业用户
 * @author: 拜无忧
 * @create: 2020-08-20
 */
@Service
public class GroupUserServiceImpl implements GroupUserService {

    @Resource
    private GroupUserMapper groupUserMapper;

    @Override
    public int addGroupUser(GroupUser groupUser) {
        return groupUserMapper.addGroupUser(groupUser);
    }

    @Override
    public int updateGroupUser(GroupUser groupUser) {
        return 0;
    }

    @Override
    public GroupUser getGroupUser(int id) {
        return null;
    }

    @Override
    public List<GroupUser> getGroupUserList(GroupUser groupUser) {
        return groupUserMapper.getGroupUserList(groupUser);
    }

    @Override
    public GroupUser selectGroupUserByname(String name) {
        return null;
    }

    @Override
    public GroupUser selectGroupUserById(int id) {
        return null;
    }

    @Override
    public int updatePassword(GroupUser groupUser) {
        return 0;
    }

    @Override
    public int updateIsdel(GroupUser groupUser) {
        return 0;
    }

    @Override
    public int updateStatus(GroupUser groupUser) {
        return 0;
    }
}
