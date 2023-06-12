package com.company.online_president_saylovi.backend.service;

import com.company.online_president_saylovi.backend.db.Database;
import com.company.online_president_saylovi.backend.dto.Response;
import com.company.online_president_saylovi.backend.model.Vote;
import com.company.online_president_saylovi.frontend.util.ScanUtil;

import java.util.Objects;
import java.util.Optional;

public class VoteService {
    public Optional<Vote> getVoteByUserId(String userId){
        return Database.VOTE_LIST.stream()
                .filter(vote -> Objects.equals(vote.getUser_Id(),userId))
                .findFirst();
    }
    public Response vote(String userId, String candidate_Id){
        try{
            Vote vote = new Vote(userId,candidate_Id);
            Database.VOTE_LIST.add(vote);

            return new Response("Thank you for using you vote! That is for our future",true);
        }catch (Exception e){
            e.printStackTrace();
            return new Response(e.getMessage(),false);
        }
    }

    public boolean isVoted(String userId) {
        try{
            if(getVoteByUserId(userId).isPresent()){
                return true;
            }
            return false;

        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
}
