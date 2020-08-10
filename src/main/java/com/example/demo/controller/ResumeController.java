package com.example.demo.controller;

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

    @PostMapping("/saveResume")
    public Result saveResume(Candidate candidate, HttpServletRequest request){

        return Result.buildBaseSuccess();
    }


}
