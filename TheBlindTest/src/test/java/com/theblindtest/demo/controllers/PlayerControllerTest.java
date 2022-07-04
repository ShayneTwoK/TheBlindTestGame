package com.theblindtest.demo.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.theblindtest.demo.entities.Player;
import com.theblindtest.demo.services.PlayerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

class PlayerControllerTest {

    @MockBean
    PlayerService playerService;

    ObjectMapper mapper = new ObjectMapper();

    @Autowired
    private MockMvc mockMvc;

    @Test
    void should_return_player_created() {

        //GIVEN
        Player p = new Player();
        p.setName("Shayne");
        p.setAvatar("ghost");
        p.setIsHost(true);

        //WHEN
        when(playerService.savePlayer(any(Player.class))).thenReturn(p);

        //THEN
        // TO DO Test avec assertEquals
//        assertEquals(p, any(Player));

        // TO DO Test avec l'endpoint Work in Progress
//        mockMvc.perform(post("/addPlayer")
//                .content(mapper.writeValueAsString("test"))
//                .contentType(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk()
//        );

    }

    @Test
    void addPlayers() {
    }

    @Test
    void findAllPlayers() {
    }

    @Test
    void findPlayerById() {
    }

    @Test
    void findPlayerByName() {
    }

    @Test
    void updatePlayer() {
    }

    @Test
    void deletePlayer() {
    }
}