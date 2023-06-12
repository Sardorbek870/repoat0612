package com.company.online_president_saylovi.backend.service;

import com.company.online_president_saylovi.backend.db.Database;
import com.company.online_president_saylovi.backend.model.CandidateProgram;

import java.util.Collections;
import java.util.Objects;
import java.util.Optional;

public class CandidateProgramService {
    public String getTextOfProgramByCandidateId(String candidate_Id){

        Optional<CandidateProgram> candidateProgram1 = Database.CANDIDATE_PROGRAM_LIST.stream()
                .filter(candidateProgram -> Objects.equals(candidateProgram.getCandidate_Id(), candidate_Id))
                .findFirst();
        if(candidateProgram1.isEmpty()){
            return "wrong candidite ";
        }
        return candidateProgram1.get().getTextOfProgram();


    }
}
