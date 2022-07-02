package com.theblindtest.demo.controllers;

import com.theblindtest.demo.entities.Player;
import com.theblindtest.demo.services.PlayerService;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PlayerController {

    Logger logger = LoggerFactory.getLogger(PlayerController.class);

    @Autowired
    private PlayerService playerService;

    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Joueur Ajouter !", content = { @Content(mediaType = "application/json", schema = @Schema(implementation = Player.class)) }),
            @ApiResponse(responseCode = "400", description = "La requête pour ajouter le Joueur n'a pas pu aboutir", content = @Content),
            @ApiResponse(responseCode = "404", description = "Joueur Introuvable", content = @Content) })
    @PostMapping("api/v1/addPlayer")
    public Player addPlayer(@RequestBody Player player){

        logger.info( "Appel de la méthode addPlayer");

        return playerService.savePlayer(player);
    }

    @PostMapping("api/v1/addPlayers")
    public List<Player> addPlayers(@RequestBody List<Player> players){

        logger.info( "Appel de la méthode addPlayers");

        return playerService.savePlayers(players);
    }

    @GetMapping("api/v1/players")
    public List<Player> findAllPlayers(){

        logger.info( "Appel de la méthode findAllPlayers");

        return playerService.getPlayers();
    }

    @GetMapping("api/v1/player/{id}")
    public Player findPlayerById(@PathVariable Long id){

        logger.info( "Appel de la méthode findPlayerById avec l'id " + id);

        return playerService.getPlayerById(id);
    }

    @GetMapping("api/v1/player/{name}")
    public Player findPlayerByName(@PathVariable String name){

        logger.info( "Appel de la méthode findPlayerByName avec le nom " + name);

        return playerService.getPlayerByName(name);
    }

    @PutMapping("api/v1/update")
    public Player updatePlayer(@RequestBody Player player){

        logger.info( "Appel de la méthode updatePlayer avec le player " + player);

        return playerService.updatePlayer(player);
    }

    @DeleteMapping("api/v1/delete/{id}")
    public String deletePlayer(@PathVariable Long id){

        logger.info( "Appel de la méthode deletePlayer avec l'id " + id);

        return playerService.deletePlayer(id);
    }
}
