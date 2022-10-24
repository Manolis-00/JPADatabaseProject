package com.example.springdatabase.repositories;

import com.example.springdatabase.models.Guest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GuestRepository extends CrudRepository<Guest, Integer> {

    public Guest findGuestsByGuest_id(Integer guest_id);
    public List<Guest> findGuestsByName(String name);
}
