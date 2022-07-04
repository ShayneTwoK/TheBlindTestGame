package com.theblindtest.demo.controllers;

import com.theblindtest.demo.entities.Player;
import com.theblindtest.demo.services.PlayerService;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class PlayerController {

    Logger logger = LoggerFactory.getLogger(PlayerController.class);

    @Autowired
    private PlayerService playerService;

    @Operation(summary = "Ajoute un joueur")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Joueur Ajouter !", content = { @Content(mediaType = "application/json", schema = @Schema(implementation = Player.class)) }),
            @ApiResponse(responseCode = "400", description = "La requête pour ajouter le Joueur n'a pas pu aboutir", content = @Content),
            @ApiResponse(responseCode = "404", description = "Joueur Introuvable", content = @Content),
            @ApiResponse(responseCode = "500", description = "Erreur Interne, Serveur Inaccessible", content = @Content) })
    @PostMapping("api/v1/addPlayer")
    public Player addPlayer(@RequestBody Player player){

        logger.info( "Appel de la méthode addPlayer");

        return playerService.savePlayer(player);
    }

    @Operation(summary = "Ajoute une liste de joueurs")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Les Joueurs ont été ajoutés !", content = { @Content(mediaType = "application/json", schema = @Schema(implementation = Player.class)) }),
            @ApiResponse(responseCode = "400", description = "La requête pour ajouter les Joueurs n'a pas pu aboutir", content = @Content),
            @ApiResponse(responseCode = "404", description = "Les Joueurs que vous voulez ajouter sont Introuvables", content = @Content),
            @ApiResponse(responseCode = "500", description = "Erreur Interne, Serveur Inaccessible", content = @Content) })
    @PostMapping("api/v1/addPlayers")
    public List<Player> addPlayers(@RequestBody List<Player> players){

        logger.info( "Appel de la méthode addPlayers");

        return playerService.savePlayers(players);
    }

    @Operation(summary = "Récupére tout les joueurs")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Les Joueurs ont été récupéré !", content = { @Content(mediaType = "application/json", schema = @Schema(implementation = Player.class)) }),
            @ApiResponse(responseCode = "400", description = "La requête pour récupérer les Joueurs n'a pas pu aboutir", content = @Content),
            @ApiResponse(responseCode = "404", description = "Les Joueurs démandé sont Introuvables", content = @Content),
            @ApiResponse(responseCode = "500", description = "Erreur Interne, Serveur Inaccessible", content = @Content) })
    @GetMapping("api/v1/players")
    public List<Player> findAllPlayers(){

        logger.info( "Appel de la méthode findAllPlayers");

        return playerService.getPlayers();
    }

    @Operation(summary = "Récupére le joueur avec son identifiant en paramètre")
    @Parameter(name = "id", description = "Identifiant du joueur", example = "1")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Le Joueur a été récupéré !", content = { @Content(mediaType = "application/json", schema = @Schema(implementation = Player.class)) }),
            @ApiResponse(responseCode = "400", description = "La requête pour récupérer le Joueur avec son Id n'a pas pu aboutir", content = @Content),
            @ApiResponse(responseCode = "404", description = "Le Joueur démandé est Introuvable", content = @Content),
            @ApiResponse(responseCode = "500", description = "Erreur Interne, Serveur Inaccessible", content = @Content) })
    @GetMapping("api/v1/player/{id}")
    public Player findPlayerById(@PathVariable Long id){

        logger.info( "Appel de la méthode findPlayerById avec l'id " + id);

        return playerService.getPlayerById(id);
    }

    @Operation(summary = "Récupére le joueur avec son nom en paramètre")
    @Parameter(name = "name", description = "Nom du joueur", example = "Shayne")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Le Joueur a été récupéré !", content = { @Content(mediaType = "application/json", schema = @Schema(implementation = Player.class)) }),
            @ApiResponse(responseCode = "400", description = "La requête pour récupérer le Joueur avec son Nom n'a pas pu aboutir", content = @Content),
            @ApiResponse(responseCode = "404", description = "Le Joueur démandé est Introuvable", content = @Content),
            @ApiResponse(responseCode = "500", description = "Erreur Interne, Serveur Inaccessible", content = @Content) })
    @GetMapping("api/v1/player/name")
    @ResponseBody
    public Player findPlayerByName(@RequestParam String name){

        logger.info( "Appel de la méthode findPlayerByName avec le nom " + name);

        return playerService.getPlayerByName(name);
    }

    @Operation(summary = "Met à jour le joueur")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Le Joueur a été mis à jour !", content = { @Content(mediaType = "application/json", schema = @Schema(implementation = Player.class)) }),
            @ApiResponse(responseCode = "400", description = "La requête pour mettre à jour le Joueur n'a pas pu aboutir", content = @Content),
            @ApiResponse(responseCode = "404", description = "Le Joueur démandé est Introuvable", content = @Content),
            @ApiResponse(responseCode = "500", description = "Erreur Interne, Serveur Inaccessible", content = @Content) })
    @PutMapping("api/v1/updatePlayer")
    public Player updatePlayer(@RequestBody Player player){

        logger.info( "Appel de la méthode updatePlayer avec le player " + player);

        return playerService.updatePlayer(player);
    }

    @Operation(summary = "Supprime le joueur")
    @Parameter(name = "id", description = "Identifiant du Joueur", example = "1")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Le Joueur a bien été supprimé !", content = { @Content(mediaType = "application/json", schema = @Schema(implementation = Player.class)) }),
            @ApiResponse(responseCode = "400", description = "La requête pour supprimé le Joueur n'a pas pu aboutir", content = @Content),
            @ApiResponse(responseCode = "404", description = "Le Joueur démandé est Introuvable", content = @Content),
            @ApiResponse(responseCode = "500", description = "Erreur Interne, Serveur Inaccessible", content = @Content) })
    @DeleteMapping("api/v1/deletePlayer/{id}")
    public String deletePlayer(@PathVariable Long id){

        logger.info( "Appel de la méthode deletePlayer avec l'id " + id);

        return playerService.deletePlayer(id);
    }
}
