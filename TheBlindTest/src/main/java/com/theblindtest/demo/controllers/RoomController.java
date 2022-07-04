package com.theblindtest.demo.controllers;

import com.theblindtest.demo.entities.Player;
import com.theblindtest.demo.entities.Room;
import com.theblindtest.demo.services.RoomService;
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

import java.util.List;

@CrossOrigin
@RestController
public class RoomController {

    Logger logger = LoggerFactory.getLogger(PlayerController.class);

    @Autowired
    private RoomService roomService;

    @Operation(summary = "Ajoute une Room")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Room Ajouter !", content = { @Content(mediaType = "application/json", schema = @Schema(implementation = Player.class)) }),
            @ApiResponse(responseCode = "400", description = "La requête pour ajouter le Room n'a pas pu aboutir", content = @Content),
            @ApiResponse(responseCode = "500", description = "Erreur Interne, Serveur Inaccessible", content = @Content) })
    @PostMapping("api/v1/addRoom")
    public Room addRoom(@RequestBody Room room){

        logger.info( "Appel de la méthode addRoom");

        return roomService.saveRoom(room);
    }

    @Operation(summary = "Récupére toute les rooms")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Les Rooms ont été récupéré !", content = { @Content(mediaType = "application/json", schema = @Schema(implementation = Player.class)) }),
            @ApiResponse(responseCode = "400", description = "La requête pour récupérer les Rooms n'a pas pu aboutir", content = @Content),
            @ApiResponse(responseCode = "404", description = "Les Rooms démandé sont Introuvables", content = @Content),
            @ApiResponse(responseCode = "500", description = "Erreur Interne, Serveur Inaccessible", content = @Content) })
    @GetMapping("api/v1/rooms")
    public List<Room> findAllRooms(){

        logger.info( "Appel de la méthode findAllRooms");

        return roomService.getRooms();
    }

    @Operation(summary = "Récupére la room avec son identifiant en paramètre")
    @Parameter(name = "id", description = "Identifiant de la room", example = "1")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "La Room a été récupéré !", content = { @Content(mediaType = "application/json", schema = @Schema(implementation = Player.class)) }),
            @ApiResponse(responseCode = "400", description = "La requête pour récupérer la Room avec son Id n'a pas pu aboutir", content = @Content),
            @ApiResponse(responseCode = "404", description = "La Room démandé est Introuvable", content = @Content),
            @ApiResponse(responseCode = "500", description = "Erreur Interne, Serveur Inaccessible", content = @Content) })
    @GetMapping("api/v1/room/{id}")
    public Room findRoomById(@PathVariable Long id){

        logger.info( "Appel de la méthode findRoomById avec l'id " + id);

        return roomService.getRoomById(id);
    }


    @Operation(summary = "Met à jour la room")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "La Room a été mis à jour !", content = { @Content(mediaType = "application/json", schema = @Schema(implementation = Player.class)) }),
            @ApiResponse(responseCode = "400", description = "La requête pour mettre à jour la Room n'a pas pu aboutir", content = @Content),
            @ApiResponse(responseCode = "404", description = "La Room démandé est Introuvable", content = @Content),
            @ApiResponse(responseCode = "500", description = "Erreur Interne, Serveur Inaccessible", content = @Content) })
    @PutMapping("api/v1/updateRoom")
    public Room updateRoom(@RequestBody Room room){

        logger.info( "Appel de la méthode updateRoom avec le player " + room);

        return roomService.updateRoom(room);
    }


    @Operation(summary = "Supprime la room")
    @Parameter(name = "id", description = "Identifiant de la room", example = "1")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "La Room a bien été supprimé !", content = { @Content(mediaType = "application/json", schema = @Schema(implementation = Player.class)) }),
            @ApiResponse(responseCode = "400", description = "La requête pour supprimé la Room n'a pas pu aboutir", content = @Content),
            @ApiResponse(responseCode = "404", description = "La Room démandé est Introuvable", content = @Content),
            @ApiResponse(responseCode = "500", description = "Erreur Interne, Serveur Inaccessible", content = @Content) })
    @DeleteMapping("api/v1/deleteRoom/{id}")
    public String deleteRoom(@PathVariable Long id){

        logger.info( "Appel de la méthode deleteRoom avec l'id " + id);

        return roomService.deleteRoom(id);
    }

}
