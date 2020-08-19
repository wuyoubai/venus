package com.example.demo.service.interfaces;

import com.example.demo.bean.Group;

import java.util.List;

public interface GroupService {
    int addGroup(Group group);
    int editGroup(Group group);
    int delete(int id);
    Group getGroup(int id);
    List<Group> getGroupList(Group group);

    Group selectGroupByGroupname(String groupname);
    Group selectGroupById(int id);
    int updateIsdel(Group group);
}
