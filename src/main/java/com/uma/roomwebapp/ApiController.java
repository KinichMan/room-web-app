/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uma.roomwebapp;

import com.frankmoley.landon.aop.Timed;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Kinich Mansilla
 */
@RestController
@RequestMapping("/api")
public class ApiController {

    private final RoomServices roomServices;

    @Autowired
    public ApiController(RoomServices roomServices) {
        super();
        this.roomServices = roomServices;
    }

    @GetMapping("/rooms")
    @Timed
    public List<Room> getAllRooms() {
        return roomServices.getAllRooms();
    }
}
