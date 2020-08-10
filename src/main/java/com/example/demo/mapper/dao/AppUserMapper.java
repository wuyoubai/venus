package com.example.demo.mapper.dao;

import com.example.demo.bean.AppUser;

import java.util.List;

public interface AppUserMapper {
    int register(AppUser user);
    int update(AppUser user);
    int delete(int id);
    AppUser getAppUser(int id);
    List<AppUser> getAppUserList();

    AppUser selectAppUserByPhone(String phone);
    AppUser selectAppUserById(int id);
    int updateAppUserPassword(AppUser user);
    int updateProfile(AppUser user);
}
