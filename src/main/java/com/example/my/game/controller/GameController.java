package com.example.my.game.controller;

import com.example.my.game.game.Game;
import com.example.my.game.game.GameRepository;
import com.example.my.game.game.GameRequestDTO;
import com.example.my.game.game.GameResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("game")
public class GameController {

    @Autowired
    private  GameRepository repository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<GameResponseDTO> getAll(){

        List<GameResponseDTO> gamelist = repository.findAll().stream().map(GameResponseDTO::new).toList();
        return gamelist;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveGame(@RequestBody GameRequestDTO data){
        Game gameData = new Game(data);
        repository.save(gameData);
        return;
    }

}
