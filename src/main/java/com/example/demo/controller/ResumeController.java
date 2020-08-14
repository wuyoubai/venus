package com.example.demo.controller;

import com.example.demo.bean.Candidate;
import com.example.demo.result.Result;
import com.example.demo.service.interfaces.CandidateService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
public class ResumeController {

    @Resource
    private CandidateService candidateService;

    /**
     *@Description:添加候选人基础信息
     *@Author:拜无忧
     *@Date:2020/8/10
     */
    @PostMapping("/saveCandidate")
    public Result saveResume(Candidate candidate, HttpServletRequest request) {

        return Result.buildBaseSuccess();
    }


}
