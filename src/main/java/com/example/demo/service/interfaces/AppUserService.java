package com.example.demo.service.interfaces;

import com.example.demo.bean.AppUser;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface AppUserService {
    int register(AppUser user);
    int update(AppUser user);
    int delete(int id);
    AppUser getUser(int id);
    List<AppUser> getUserList();

    AppUser selectAppUserByPhone(String phone);
    AppUser selectAppUserByUserId(int id);

    int updateAppUserPassword(AppUser user);
    int updateProfiles(AppUser user);
}
