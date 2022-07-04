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
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String code;
    @Transient
    // Je n'arrive pas à stocker une list de Player dans la table
    //@ElementCollection
    private List<Player> players;

    public Room(String code, List<Player> players) {
        this.code = code;
        this.players = players;
    }
}
