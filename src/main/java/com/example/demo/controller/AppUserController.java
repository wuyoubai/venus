package com.example.demo.controller;

import com.example.demo.bean.AppUser;
import com.example.demo.result.Result;
import com.example.demo.service.interfaces.AppUserService;
import com.example.demo.utils.CommonConst;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

@RestController
public class AppUserController {

    @Resource
    private AppUserService appUserService;

    @PostMapping("/register")
    public Result register(AppUser user, HttpServletRequest request){
        Date date = new Date();
        user.setCreatetime(date);
        appUserService.register(user);
        return Result.buildBaseSuccess("注册成功！");
    }

    @PostMapping("/profiles")
    public Result profiles(MultipartFile profile,HttpServletRequest request){
        int id = (int)request.getSession().getAttribute(CommonConst.SESSION_KEY);
        AppUser user = appUserService.getUser(id);
        // 根据Windows和Linux配置不同的头像保存路径
        String OSName = System.getProperty("os.name");
        String profilesPath = OSName.toLowerCase().startsWith("win") ? CommonConst.WINDOWS_PROFILES_PATH
                : CommonConst.LINUX_PROFILES_PATH;
        String newProfileName = profilesPath+ System.currentTimeMillis()+ profile.getOriginalFilename();
        user.setProfile(newProfileName);
        appUserService.updateProfiles(user);
        // 磁盘保存
        BufferedOutputStream out = null;
        try {
            File folder = new File(profilesPath);
            if (!folder.exists())
                folder.mkdirs();
            out = new BufferedOutputStream(new FileOutputStream(newProfileName));
            // 写入新文件
            out.write(profile.getBytes());
            out.flush();
        } catch (Exception e) {
            e.printStackTrace();
//            return new SystemResult(HttpStatus.OK.value(), "设置头像失败", Boolean.FALSE);
            return Result.buildBaseFail("修改失败");
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return Result.buildBaseSuccess("修改成功");
    }

}
