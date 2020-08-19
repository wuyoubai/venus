package com.example.demo.service.impl;

import com.example.demo.bean.User;
import com.example.demo.mapper.dao.UserMapper;
import com.example.demo.service.interfaces.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public int addUser(User user) {
        return userMapper.addUser(user);
    }

    @Override
    public int update(User user) {
        return userMapper.update(user);
    }

    @Override
    public int delete(int id) {
        return 0;
    }

    @Override
    public User getUser(int id) {
        return null;
    }

    @Override
    public List<User> getUserList(User user) {
        return userMapper.getUserList(user);
    }

    @Override
    public User selectUserByUsername(String username) {
        return userMapper.selectUserByUsername(username);
    }

    @Override
    public User selectUserByUserId(int id) {
        return userMapper.selectUserByUserId(id);
    }

    @Override
    public int updatePassword(User user) {
        return userMapper.updatePassword(user);
    }

    @Override
    public int updateIsdel(User user) {
        return userMapper.updateIsdel(user);
    }

}
