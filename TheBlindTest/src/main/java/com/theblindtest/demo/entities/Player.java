package com.theblindtest.demo.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
@Data // Getter, Setter, RequiredArgsConstructor
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String avatar;
    private Integer point;
    private Boolean isHost;

}
