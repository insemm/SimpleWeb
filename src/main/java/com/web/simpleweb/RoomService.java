package com.web.simpleweb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoomService {
    private RoomRepo roomRepo;

    @Autowired
    public RoomService(RoomRepo roomRepo){
        super();
        this.roomRepo = roomRepo;
    }

    public List<Room> getAllRoom(){
        List<Room> room = new ArrayList<>();
        this.roomRepo.findAll().forEach(room::add);
        return room;
    }

}
