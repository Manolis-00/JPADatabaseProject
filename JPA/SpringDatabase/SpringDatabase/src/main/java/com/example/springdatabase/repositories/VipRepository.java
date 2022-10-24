package com.example.springdatabase.repositories;

import com.example.springdatabase.models.Vip;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VipRepository extends CrudRepository<Vip, Integer> {
    public Vip findVipsByVip_id(Integer vip_id);
    public List<Vip> findVipsByName(String name);
}
