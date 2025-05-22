package com.example.dslist.controllers;

import com.example.dslist.dto.GameDTO;
import com.example.dslist.dto.GameMinDTO;
import com.example.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {
    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> findAll(){
        List<GameMinDTO> result = gameService.findAll();
        return result;
    }

    @GetMapping(value = "/{id}")
    public GameDTO findbyId(@PathVariable Long id){
        GameDTO result = gameService.findById(id);
        return result;
    }
}
