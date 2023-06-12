package com.company.online_president_saylovi.backend.service;

import com.company.online_president_saylovi.backend.db.Database;
import com.company.online_president_saylovi.backend.model.Candidate;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class CandidateService {
    public Optional<Candidate> getCandidateById(String candidateId){
        return Database.CANDIDATE_LIST.stream()
                .filter(candidate -> Objects.equals(candidate.getId(),candidateId))
                .findFirst();
    }

    public List<Candidate> showCandidatesList(){
        return Database.CANDIDATE_LIST;
    }
}
