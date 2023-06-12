package com.company.online_president_saylovi.backend.model;

import lombok.Data;
import lombok.NonNull;
import lombok.ToString;

@Data

@ToString(callSuper = true, exclude = "password")
public class User extends BaseModel{
    private final @NonNull String firstname;
    private final @NonNull String lastname;
    private final @NonNull String passportSeria;
    private final @NonNull String passportNumber;
    private final @NonNull String phoneNumber;
    private final @NonNull String password;
}
