package com.theblindtest.demo.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;


@Entity
@Data // Getter, Setter, RequiredArgsConstructor
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String code;
    @OneToMany
    private List<Player> players;
}
