package com.company.online_president_saylovi.backend.service;

import com.company.online_president_saylovi.backend.model.User;
import com.company.online_president_saylovi.backend.dto.Response;
import lombok.NonNull;

import java.util.Optional;

public interface UserService {
    Optional<User> getUserById(String userId);

    Optional<User> getUserBuPhoneNumber(String phoneNumber);

    Response voteCandidate(String candidateId);
    public Response login1 (@NonNull String phoneNumber, @NonNull String password);
}
