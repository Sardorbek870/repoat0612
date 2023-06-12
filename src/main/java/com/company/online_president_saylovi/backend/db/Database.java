package com.company.online_president_saylovi.backend.db;

import com.company.online_president_saylovi.backend.enums.Degree;
import com.company.online_president_saylovi.backend.model.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public interface Database {
    List<User> USER_LIST = new ArrayList<>();
    List<Party> PARTY_LIST = new ArrayList<>();
    List<Candidate> CANDIDATE_LIST = new ArrayList<>();
    List<CandidateProgram> CANDIDATE_PROGRAM_LIST = new ArrayList<>();
    List<Vote> VOTE_LIST = new ArrayList<>();

    public static void dataLoad(){

        // 5 users
        User user1 = new User("firstname1","lastname1","passortSeria1",
                "passportNumber1","phoneNumber1","password1");

        User user2 = new User("firstname2","lastname2","passortSeria2",
                "passportNumber2","phoneNumber2","password2");

        User user3 = new User("firstname3","lastname3","passortSeria3",
                "passportNumber3","phoneNumber3","password3");

        User user4 = new User("firstname4","lastname4","passortSeria4",
                "passportNumber4","phoneNumber4","password4");

        User user5 = new User("firstname5","lastname5","passortSeria5",
                "passportNumber5","phoneNumber5","password5");

        Collections.addAll(USER_LIST,user1,user2,user3,user4, user5);

        // 5 parties
        Party party1 = new Party("partyName1","partyMotto1");
        Party party2 = new Party("partyName2","partyMotto2");
        Party party3 = new Party("partyName3","partyMotto3");
        Party party4 = new Party("partyName4","partyMotto4");
        Party party5 = new Party("partyName5","partyMotto5");

        Collections.addAll(PARTY_LIST,party1, party2, party3, party4, party5);

        // 5 candidates
        Candidate candidate1 = new Candidate("firstName1","lastName1","middleName1",
                Degree.BACHELOR, party1.getId());

        Candidate candidate2 = new Candidate("firstName2","lastName2","middleName2",
                Degree.MASTER, party2.getId());

        Candidate candidate3 = new Candidate("firstName3","lastName3","middleName3",
                Degree.PHD, party3.getId());

        Candidate candidate4 = new Candidate("firstName4","lastName4","middleName4",
                Degree.MASTER, party4.getId());

        Candidate candidate5 = new Candidate("firstName5","lastName5","middleName5",
                Degree.MASTER,party5.getId());

        Collections.addAll(CANDIDATE_LIST,candidate1, candidate2, candidate3, candidate4, candidate5);


        // Candidate programs
        CandidateProgram candidateProgram1 = new CandidateProgram(candidate1.getId(),"textOfProgram1");
        CandidateProgram candidateProgram2 = new CandidateProgram(candidate2.getId(),"textOfProgram2");
        CandidateProgram candidateProgram3 = new CandidateProgram(candidate3.getId(),"textOfProgram3");
        CandidateProgram candidateProgram4 = new CandidateProgram(candidate4.getId(),"textOfProgram4");
        CandidateProgram candidateProgram5 = new CandidateProgram(candidate5.getId(),"textOfProgram5");

        Collections.addAll(CANDIDATE_PROGRAM_LIST,candidateProgram1, candidateProgram2,
                candidateProgram3, candidateProgram4, candidateProgram5);

        // 4 Votes
        Vote vote1 = new Vote(user1.getId(),candidate1.getId());
        Vote vote2 = new Vote(user2.getId(),candidate2.getId());
        Vote vote3 = new Vote(user3.getId(),candidate3.getId());
        Vote vote4 = new Vote(user4.getId(),candidate4.getId());
        // user5 has not voted yet
        Collections.addAll(VOTE_LIST,vote1, vote2, vote3, vote4);




    }
}
