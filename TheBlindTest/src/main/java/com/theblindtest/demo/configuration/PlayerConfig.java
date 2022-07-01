package com.theblindtest.demo.configuration;

import com.theblindtest.demo.entities.Player;
import com.theblindtest.demo.repositories.PlayerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class PlayerConfig {

    @Bean
    CommandLineRunner commandLineRunner(PlayerRepository playerRepository) {
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

            playerRepository.saveAll(
                    List.of(shayne, axel)
            );

        };
    }
}
