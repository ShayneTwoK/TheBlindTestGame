package com.theblindtest.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Party {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String code;

    @Transient
    // Je n'arrive pas à stocker une list de Player dans la table
    // via le fichier de config
    //@ElementCollection
    private List<Player> players;

    @Transient
    private Player winner;

    public Party(String code, List<Player> players, Player winner) {
        this.code = code;
        this.players = players;
        this.winner = winner;
    }
}
