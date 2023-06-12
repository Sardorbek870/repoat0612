package com.company.online_president_saylovi.backend.model;

import com.company.online_president_saylovi.backend.enums.Degree;
import lombok.Data;
import lombok.NonNull;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public class Candidate extends BaseModel{
    private final @NonNull String firstName;
    private final @NonNull String lastName;
    private final @NonNull String middleName;
    private final @NonNull Degree degree;
    private final @NonNull String party_Id;
}
