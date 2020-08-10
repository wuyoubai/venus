package com.example.demo.service.impl;

import com.example.demo.bean.AppUser;
import com.example.demo.mapper.dao.AppUserMapper;
import com.example.demo.service.interfaces.AppUserService;
import com.example.demo.utils.CommonConst;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.BufferedOutputStream;
import java.io.File;
import java.util.List;

@Service
public class AppUserServiceImpl implements AppUserService {

    @Resource
    private AppUserMapper appUserMapper;

    @Override
    public int register(AppUser user) {
        return appUserMapper.register(user);
    }

    @Override
    public int update(AppUser user) {
        return 0;
    }

    @Override
    public int delete(int id) {
        return 0;
    }

    @Override
    public AppUser getUser(int id) {
        return null;
    }

    @Override
    public List<AppUser> getUserList() {
        return null;
    }

    @Override
    public AppUser selectAppUserByPhone(String phone) {
        return null;
    }

    @Override
    public AppUser selectAppUserByUserId(int id) {
        return null;
    }

    @Override
    public int updateAppUserPassword(AppUser user) {
        return 0;
    }

    @Override
    public int updateProfiles(AppUser user) {
        return appUserMapper.updateProfile(user);
    }
}
