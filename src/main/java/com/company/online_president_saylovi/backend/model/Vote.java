package com.company.online_president_saylovi.backend.model;

import lombok.Data;
import lombok.NonNull;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public class Vote extends BaseModel{
    private final @NonNull String user_Id;
    private final @NonNull String candidate_Id;
}
