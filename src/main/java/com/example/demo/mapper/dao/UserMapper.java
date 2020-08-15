package com.example.demo.mapper.dao;

import com.example.demo.bean.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    int addUser(User user);
    int update(User user);
    int delete(int id);
    User getUser(int id);
    List<User> getUserList(User user);

    User selectUserByUsername(String username);
    User selectUserByUserId(int id);
    int updatePassword(User user);
    int updateIsdel(User user);
}
