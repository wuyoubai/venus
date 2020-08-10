package com.example.demo.service.impl;

import com.example.demo.mapper.dao.CandidateMapper;
import com.example.demo.service.interfaces.CandidateService;

import javax.annotation.Resource;
import java.util.List;

public class CandidateServiceImpl implements CandidateService {

    @Resource
    private CandidateMapper candidateMapper;

    @Override
    public int addCandidate(Candidate candidate) {
        return candidateMapper.addCandidate(candidate);
    }

    @Override
    public int updateCandidate(Candidate candidate) {
        return 0;
    }

    @Override
    public int updateIsdel(Candidate candidate) {
        return 0;
    }

    @Override
    public Candidate getCandidate(int id) {
        return null;
    }

    @Override
    public List<Candidate> getCandidateList() {
        return null;
    }
}
