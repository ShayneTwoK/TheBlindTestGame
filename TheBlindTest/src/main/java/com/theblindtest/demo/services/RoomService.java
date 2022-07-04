package com.theblindtest.demo.services;

import com.theblindtest.demo.entities.Player;
import com.theblindtest.demo.entities.Room;
import com.theblindtest.demo.repositories.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class RoomService {
    @Autowired
    private RoomRepository roomRepository;

    public Room saveRoom(Room room) {
        return roomRepository.save(room);
    }

    public List<Room> getRooms() {
        return roomRepository.findAll();
    }

    public Room getRoomById(Long id) {
        return roomRepository.findById(id).orElse(null);
    }

    public Room updateRoom(Room room) {

        boolean isRoomExist = roomRepository.existsById(room.getId());

        if (!isRoomExist) {
            throw new IllegalStateException("la room avec l'id " + room.getId() + " n'existe pas.");
        }

        Room existingRoom = roomRepository.findById(room.getId()).orElse(null);

        existingRoom.setCode(room.getCode());
        existingRoom.setPlayers(room.getPlayers());

        return roomRepository.save(existingRoom);
    }

    public String deleteRoom(Long id) {

        boolean isRoomExist = roomRepository.existsById(id);

        if (!isRoomExist) {
            throw new IllegalStateException("la room avec l'id " + id + " n'existe pas.");
        }

        roomRepository.deleteById(id);

        return "player " + id + " supprimé !";
    }

}
