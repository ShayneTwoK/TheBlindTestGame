package com.theblindtest.demo.entities;

import lombok.*;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String avatar;
    private Integer point;
    private Boolean isHost;

    public Player(String name, String avatar, Integer point, Boolean isHost) {
        this.name = name;
        this.avatar = avatar;
        this.point = point;
        this.isHost = isHost;
    }
}
