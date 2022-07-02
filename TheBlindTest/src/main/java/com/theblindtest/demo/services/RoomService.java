package com.theblindtest.demo.services;

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

    public List<Room> saveRooms(List<Room> players) {
        return roomRepository.saveAll(players);
    }

    public List<Room> getRooms() {
        return roomRepository.findAll();
    }

    public Room getRoomById(Long id) {
        return roomRepository.findById(id).orElse(null);
    }

    public String deleteRoom(Long id) {
        roomRepository.deleteById(id);
        return "room supprimé ! " + id;
    }

}
