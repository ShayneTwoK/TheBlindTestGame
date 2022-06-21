package com.theblindtest.demo.controllers;

import com.theblindtest.demo.entities.Player;
import com.theblindtest.demo.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @PostMapping("/addPlayer")
    public Player addPlayer(@RequestBody Player player){
        return playerService.savePlayer(player);
    }

    @PostMapping("/addPlayers")
    public List<Player> addPlayers(@RequestBody List<Player> players){
        return playerService.savePlayers(players);
    }

    @GetMapping("/players")
    public List<Player> findAllPlayers(){
        return playerService.getPlayers();
    }

    @GetMapping("/player/{id}")
    public Player findPlayerById(@PathVariable long id){
        return playerService.getPlayerById(id);
    }

    @GetMapping("/player/{name}")
    public Player findPlayerByName(@PathVariable String name){
        return playerService.getPlayerByName(name);
    }

    @PutMapping("/update")
    public Player updatePlayer(@RequestBody Player player){
        return playerService.updatePlayer(player);
    }

    @DeleteMapping("/delete/{id}")
    public String deletePlayer(@PathVariable long id){
        return playerService.deletePlayer(id);
    }
}
