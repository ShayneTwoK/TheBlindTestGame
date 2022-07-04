package com.theblindtest.demo.services;

import com.theblindtest.demo.entities.Party;
import com.theblindtest.demo.entities.Room;
import com.theblindtest.demo.repositories.PartyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartyService {

    @Autowired
    private PartyRepository partyRepository;

    public Party saveParty(Party party) {
        return partyRepository.save(party);
    }

    public List<Party> getPartys() {
        return partyRepository.findAll();
    }

    public Party getPartyById(Long id) {
        return partyRepository.findById(id).orElse(null);
    }

    public Party updateParty(Party party) {

        boolean isPartyExist = partyRepository.existsById(party.getId());

        if (!isPartyExist) {
            throw new IllegalStateException("la party avec l'id " + party.getId() + " n'existe pas.");
        }

        Party existingParty = partyRepository.findById(party.getId()).orElse(null);

        existingParty.setCode(party.getCode());
        existingParty.setPlayers(party.getPlayers());
        existingParty.setWinner(party.getWinner());

        return partyRepository.save(existingParty);
    }

    public String deleteParty(Long id) {

        boolean isPartyExist = partyRepository.existsById(id);

        if (!isPartyExist) {
            throw new IllegalStateException("la party avec l'id " + id + " n'existe pas.");
        }

        partyRepository.deleteById(id);

        return "party " + id + " supprimé !";
    }
}
