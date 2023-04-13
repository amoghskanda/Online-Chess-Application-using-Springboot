package com.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Game;
import com.repository.GameRepository;

@Service
public class GameService {
    
    @Autowired
    private GameRepository gameRepository;
    
    public Game createGame(Game game) {
        return gameRepository.save(game);
    }
    
    public Game getGameById(Long id) {
        return gameRepository.findById(id).orElseThrow();
    }
    
    public List<Game> getAllGames() {
        return gameRepository.findAll();
    }
    
    public void updateGame(Game game) {
        gameRepository.save(game);
    }

    public Game getCurrentGame() {
        return null;
    }

    public void makeMove(int fromX, int fromY, int toX, int toY) {
    }

    public List<Game> findAvailableGames() {
        return null;
    }

    public void joinGame(Long gameId) {
    }
}
    

