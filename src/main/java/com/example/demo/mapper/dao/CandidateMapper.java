package com.example.demo.mapper.dao;

import java.util.List;

public interface CandidateMapper {

    int addCandidate(Candidate candidate);
    int updateCandidate(Candidate candidate);
    int updateIsdel(Candidate candidate);
    Candidate getCandidate(int id);
    List<Candidate> getCandidateList();

}
