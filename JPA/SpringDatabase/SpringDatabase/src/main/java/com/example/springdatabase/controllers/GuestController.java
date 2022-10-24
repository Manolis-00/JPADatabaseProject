package com.example.springdatabase.controllers;

import com.example.springdatabase.models.Guest;
import com.example.springdatabase.services.GuestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GuestController {
    private final GuestService guestService;

    public GuestController(GuestService guestService) {
        this.guestService = guestService;
    }

    @GetMapping(path = "/Guests/{guest_id}")
    public Guest findGuestsByGuestId(@PathVariable ("guest_id") Integer guest_id) {
        return guestService.findGuestsByGuestId(guest_id);
    }

    @GetMapping(path = "/Guests/{guest_id}")
    public List<Guest> findGuestsByName(@PathVariable ("name") String name) {
        return guestService.findGuestsByName(name);
    }
}
