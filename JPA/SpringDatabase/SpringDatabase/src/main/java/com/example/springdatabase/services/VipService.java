package com.example.springdatabase.services;

import com.example.springdatabase.models.Vip;
import com.example.springdatabase.repositories.VipRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VipService {
    private final VipRepository vipRepository;

    public VipService(VipRepository vipRepository) {
        this.vipRepository = vipRepository;
    }

    public Vip findByVip_id(Integer vip_id) {
        return vipRepository.findVipsByVip_id(vip_id);
    }

    public List<Vip> findVipsByName(String name) {
        return vipRepository.findVipsByName(name);
    }
}
