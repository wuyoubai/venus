package com.example.demo.mapper.dao;

import com.example.demo.bean.Group;

import java.util.List;

public interface GroupMapper {
    int addGroup(Group group);
    int editGroup(Group group);
    int delete(int id);
    Group getGroup(int id);
    List<Group> getGroupList(Group group);
    List<Group> getGroupExpiredList(Group group);

    Group selectGroupByGroupname(String groupname);
    Group selectGroupById(int id);
    int updateIsdel(Group group);
}
