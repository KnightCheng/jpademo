package com.example.demo;

import com.example.demo.Repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {
    @Autowired
    private PlayerRepository playerRepository;


    @GetMapping(value = "/players")
    public List<Player> findAll(){
        return playerRepository.findAll();
    }

}
