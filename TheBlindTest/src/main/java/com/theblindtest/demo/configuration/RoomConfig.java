package com.theblindtest.demo.configuration;

import com.theblindtest.demo.entities.Player;
import com.theblindtest.demo.entities.Room;
import com.theblindtest.demo.repositories.RoomRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class RoomConfig {

    @Bean
    CommandLineRunner commandLineRunner(RoomRepository roomRepository) {
        return args -> {

            Player shayne = new Player(
                    "Shayne",
                    "ghost",
                    0,
                    true
            );

            Player axel = new Player(
                    "Axel",
                    "clown",
                    0,
                    false
            );

            Player roan = new Player(
                    "Rohan",
                    "hero",
                    0,
                    false
            );

            Player fora = new Player(
                    "Fora",
                    "licorn",
                    0,
                    false
            );

            List<Player> playersList = new ArrayList<>();

            playersList.add(shayne);
            playersList.add(axel);

            ArrayList<Player> playersList2 = new ArrayList<>();

            playersList.add(roan);
            playersList.add(fora);

            Room room = new Room(
                    "9FG5x",
                    null
            );

            Room room2 = new Room(
                    "8o0lp",
                    playersList
            );

            Room room3 = new Room(
                    "6d6j8",
                    playersList2
            );


            roomRepository.saveAll(
                    List.of(room, room2, room3)
            );

        };
    }

}
