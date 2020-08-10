package com.example.demo.service.interfaces;

import com.example.demo.bean.User;

import java.util.List;

public interface UserService {

    int addUser(User user);
    int update(User user);
    int delete(int id);
    User getUser(int id);
    List<User> getUserList();

    User selectUserByUsername(String username);
    User selectUserByUserId(int id);

    int updatePassword(User user);
    int updateIsdel(User user);
}
