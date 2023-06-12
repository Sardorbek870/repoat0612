package com.company.online_president_saylovi.backend.service;

import com.company.online_president_saylovi.backend.db.Database;
import com.company.online_president_saylovi.backend.model.User;
import com.company.online_president_saylovi.backend.dto.Response;
import lombok.NonNull;

import java.util.Objects;
import java.util.Optional;

public class UserServiceImpl implements UserService{
    @Override
    public Optional<User> getUserById(String userId) {
        return Database.USER_LIST.stream()
                .filter(user -> Objects.equals(user.getId(),userId))
                .findFirst();
    }

    @Override
    public Optional<User> getUserBuPhoneNumber(String phoneNumber) {
        return Database.USER_LIST.stream()
                .filter(user -> Objects.equals(user.getPhoneNumber(),phoneNumber))
                .findFirst();
    }

    @Override
    public Response voteCandidate(String candidateId) {
        return null;
    }
    public Response login1 (@NonNull String phoneNumber, @NonNull String password){
       try{

           if(phoneNumber.isBlank() || password.isBlank()){
               return new Response("both phone number and password are required",false);
           }
           Optional<User> optional = getUserBuPhoneNumber(phoneNumber);
           if(optional.isEmpty()){
               return new Response("phone number or password is wrong ",false);
           }
           User user = optional.get();
           if(!user.getPassword().equals(password)){
               return new Response("phone number or password is wrong ",false);
           }
           return new Response(user.getId(),true);
       }catch (Exception e){
           e.printStackTrace();
           return new Response(e.getMessage(),false);
       }
    }
}
