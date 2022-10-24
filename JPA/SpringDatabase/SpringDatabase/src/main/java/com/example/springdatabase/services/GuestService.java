package com.example.springdatabase.services;

import com.example.springdatabase.models.Guest;
import com.example.springdatabase.repositories.GuestRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestService {
    private final GuestRepository guestRepository;

    public GuestService(GuestRepository guestRepository) {
        this.guestRepository = guestRepository;
    }

    public Guest findGuestsByGuestId(Integer guest_id) {
        return guestRepository.findGuestsByGuest_id(guest_id);
    }

    public List<Guest> findGuestsByName(String name) {
        return guestRepository.findGuestsByName(name);
    }
}
