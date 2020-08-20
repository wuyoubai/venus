package com.example.demo.service.interfaces;

import com.example.demo.bean.GroupUser;

import java.util.List;

public interface GroupUserService {
    int addGroupUser(GroupUser groupUser);
    int updateGroupUser(GroupUser groupUser);
    GroupUser getGroupUser(int id);
    List<GroupUser> getGroupUserList(GroupUser groupUser);

    GroupUser selectGroupUserByname(String name);
    GroupUser selectGroupUserById(int id);
    int updatePassword(GroupUser groupUser);
    int updateIsdel(GroupUser groupUser);
    int updateStatus(GroupUser groupUser);
}
