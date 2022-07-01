package com.theblindtest.demo.services;

import com.theblindtest.demo.entities.Player;
import com.theblindtest.demo.repositories.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PlayerService {
    @Autowired
    private PlayerRepository playerRepository;

    public Player savePlayer(Player player) {
        return playerRepository.save(player);
    }

    public List<Player> savePlayers(List<Player> players) {
        return playerRepository.saveAll(players);
    }

    public List<Player> getPlayers() {
        return playerRepository.findAll();
    }

    public Player getPlayerById(long id) {
        return playerRepository.findById(id).orElse(null);
    }

    public Player getPlayerByName(String name) {
        return playerRepository.findByName(name);
    }

    public Player updatePlayer(Player player) {
        Player existingPlayer = playerRepository.findById(player.getId()).orElse(null);
        existingPlayer.setName(player.getName());
        existingPlayer.setAvatar(player.getAvatar());
        existingPlayer.setPoint(player.getPoint());
        existingPlayer.setIsHost(player.getIsHost());
        return playerRepository.save(existingPlayer);
    }

    public String deletePlayer(long id) {
        playerRepository.deleteById(id);
        return "player " + id + " supprimé !";
    }

}
