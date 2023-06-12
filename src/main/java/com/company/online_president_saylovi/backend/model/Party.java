package com.company.online_president_saylovi.backend.model;

import lombok.Data;
import lombok.NonNull;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public class Party extends BaseModel{
    private final @NonNull String partyName;
    private final @NonNull String partyMotto;

}
