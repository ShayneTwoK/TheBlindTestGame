package com.theblindtest.demo.controllers;

import com.theblindtest.demo.entities.Party;
import com.theblindtest.demo.services.PartyService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Part;
import java.util.List;

@CrossOrigin
@RestController
public class PartyController {

    Logger logger = LoggerFactory.getLogger(PartyController.class);

    @Autowired
    private PartyService partyService;

    @Operation(summary = "Ajoute une Party")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Party Ajouter !", content = { @Content(mediaType = "application/json", schema = @Schema(implementation = Party.class)) }),
            @ApiResponse(responseCode = "400", description = "La requête pour ajouter la Party n'a pas pu aboutir", content = @Content),
            @ApiResponse(responseCode = "500", description = "Erreur Interne, Serveur Inaccessible", content = @Content) })
    @PostMapping("api/v1/addParty")
    public Party addParty(@RequestBody Party party){

        logger.info( "Appel de la méthode addParty");

        return partyService.saveParty(party);
    }

    @Operation(summary = "Récupére toute les parties")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Les parties ont été récupéré !", content = { @Content(mediaType = "application/json", schema = @Schema(implementation = Party.class)) }),
            @ApiResponse(responseCode = "400", description = "La requête pour récupérer les Parties n'a pas pu aboutir", content = @Content),
            @ApiResponse(responseCode = "404", description = "Les Parties démandé sont Introuvables", content = @Content),
            @ApiResponse(responseCode = "500", description = "Erreur Interne, Serveur Inaccessible", content = @Content) })
    @GetMapping("api/v1/partys")
    public List<Party> findAllPartys(){

        logger.info( "Appel de la méthode findAllPartys");

        return partyService.getPartys();
    }

    @Operation(summary = "Récupére la party avec son identifiant en paramètre")
    @Parameter(name = "id", description = "Identifiant de la party", example = "1")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "La Party a été récupéré !", content = { @Content(mediaType = "application/json", schema = @Schema(implementation = Party.class)) }),
            @ApiResponse(responseCode = "400", description = "La requête pour récupérer la Party avec son Id n'a pas pu aboutir", content = @Content),
            @ApiResponse(responseCode = "404", description = "La Party démandé est Introuvable", content = @Content),
            @ApiResponse(responseCode = "500", description = "Erreur Interne, Serveur Inaccessible", content = @Content) })
    @GetMapping("api/v1/party/{id}")
    public Party findPartyById(@PathVariable Long id){

        logger.info( "Appel de la méthode findPartyById avec l'id " + id);

        return partyService.getPartyById(id);
    }

    @Operation(summary = "Met à jour la party")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "La Party a été mis à jour !", content = { @Content(mediaType = "application/json", schema = @Schema(implementation = Party.class)) }),
            @ApiResponse(responseCode = "400", description = "La requête pour mettre à jour la Party n'a pas pu aboutir", content = @Content),
            @ApiResponse(responseCode = "404", description = "La Party démandé est Introuvable", content = @Content),
            @ApiResponse(responseCode = "500", description = "Erreur Interne, Serveur Inaccessible", content = @Content) })
    @PutMapping("api/v1/updateParty")
    public Party updateParty(@RequestBody Party party){

        logger.info( "Appel de la méthode updateParty avec la party " + party);

        return partyService.updateParty(party);
    }

    @Operation(summary = "Supprime la party")
    @Parameter(name = "id", description = "Identifiant de la party", example = "1")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "La Party a bien été supprimé !", content = { @Content(mediaType = "application/json", schema = @Schema(implementation = Party.class)) }),
            @ApiResponse(responseCode = "400", description = "La requête pour supprimé la Party n'a pas pu aboutir", content = @Content),
            @ApiResponse(responseCode = "404", description = "La Party démandé est Introuvable", content = @Content),
            @ApiResponse(responseCode = "500", description = "Erreur Interne, Serveur Inaccessible", content = @Content) })
    @DeleteMapping("api/v1/deleteParty/{id}")
    public String deleteParty(@PathVariable Long id){

        logger.info( "Appel de la méthode deleteParty avec l'id " + id);

        return partyService.deleteParty(id);
    }

}
