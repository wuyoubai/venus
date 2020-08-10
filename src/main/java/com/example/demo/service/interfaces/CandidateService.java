package com.example.demo.service.interfaces;

import com.example.demo.bean.Candidate;

import java.util.List;

public interface CandidateService {
    int addCandidate(Candidate candidate);
    int updateCandidate(Candidate candidate);
    int updateIsdel(Candidate candidate);
    Candidate getCandidate(int id);
    List<Candidate> getCandidateList();
}
