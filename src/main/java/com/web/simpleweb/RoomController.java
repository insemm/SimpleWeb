package com.web.simpleweb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/Room")
public class RoomController {

    private RoomService roomService;

    @Autowired
    public RoomController(RoomService roomService) {
        super();
        this.roomService = roomService;
    }

    @GetMapping
    public String listAll(Model model) {
        List<Room> Room = roomService.getAllRoom();
        model.addAttribute("Room", Room);
        return "Room";
    }
}
