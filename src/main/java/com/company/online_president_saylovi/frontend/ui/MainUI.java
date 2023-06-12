package com.company.online_president_saylovi.frontend.ui;

import com.company.online_president_saylovi.backend.dto.Response;
import com.company.online_president_saylovi.backend.model.Candidate;
import com.company.online_president_saylovi.backend.model.Vote;
import com.company.online_president_saylovi.backend.service.*;
import com.company.online_president_saylovi.frontend.util.ScanUtil;

import java.sql.SQLOutput;

public class MainUI {
    public void authWindow(){
        while (true){
            System.out.println("""
                1. Login: 
                0. Stop:
                """);
            String option = ScanUtil.getInputAsString("?:");

            if(option.equals("0")){
                return;
            }else if(option.equals("1")){
                loginUI();
            }

        }

    }

    private void loginUI() {
        String phoneNumber = ScanUtil.getInputAsString("Enter phone number: ");
        String password = ScanUtil.getInputAsString("Enter password:");

        UserService userService = new UserServiceImpl();
        Response response = userService.login1(phoneNumber, password);
        if(response.success()){
            cabinet(response.message());
        }else {
            System.out.println(response.message());
        }
    }

    private void cabinet(String userId) {
        System.out.println("Welcome to your cabinet!!!");
        while(true){
            System.out.println("""
                    1. Candidates
                    2. Voting
                    0. Logout
                    """);
            String option = ScanUtil.getInputAsString("?:");
            if(option.equals("0")){
                return;
            }
            switch (option){
                case "1" -> showCandidates();
                case "2" -> VoteACandidate(userId);
            }
        }

    }

    private void VoteACandidate(String userId) {
        VoteService voteService = new VoteService();
        boolean voted = voteService.isVoted(userId);

        if(voted){
            System.out.println("You have already used your vote ");
        }else{
            String candidate_Id = ScanUtil.getInputAsString("Enter candidateId :");
            System.out.println(voteService.vote(userId, candidate_Id).message());
        }
    }

    private void showCandidates() {

        CandidateService candidateService = new CandidateService();
        for (Candidate candidate : candidateService.showCandidatesList()) {
            System.out.println("Candidate : " + candidate.getFirstName() + " " +
                    candidate.getLastName() + ", Id : " + candidate.getId());

        }
        String option = ScanUtil.getInputAsString("Enter candidate_Id ");

        PartyService partyService = new PartyService();
        CandidateProgramService candidateProgramService = new CandidateProgramService();
        System.out.println("------------------------------");

        System.out.println("party : " + partyService.getPartyById(option).get().getPartyName());
        System.out.println("candidate degree : " + candidateService.getCandidateById(option).get().getDegree());
        System.out.println("candidate program : " +candidateProgramService.getTextOfProgramByCandidateId(option));
    }
}
