package com.company.online_president_saylovi.backend.service;

import com.company.online_president_saylovi.backend.db.Database;
import com.company.online_president_saylovi.backend.model.Party;

import javax.xml.crypto.Data;
import java.util.Objects;
import java.util.Optional;

public class PartyService {
    public Optional<Party> getPartyById(String partyId){
        return Database.PARTY_LIST.stream()
                .filter(party -> Objects.equals(party.getId(),partyId))
                .findFirst();
    }
}
