package com.example.springdatabase.controllers;

import com.example.springdatabase.models.Vip;
import com.example.springdatabase.services.VipService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VipController {
    private final VipService vipService;

    public VipController(VipService vipService) {
        this.vipService = vipService;
    }

    @GetMapping(path = "/Vips/{vip_id}")
    public Vip findByVip_ip(@PathVariable ("vip_id") Integer vip_id) {
        return vipService.findByVip_id(vip_id);
    }

    @GetMapping(path = "/Vips/{name}")
    public List<Vip> findVipsByName(@PathVariable ("name") String name) {
        return vipService.findVipsByName(name);
    }
}
