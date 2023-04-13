package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.Game;
import com.services.GameService;

import java.util.List;

@Controller
public class MatchmakingController {

    @Autowired
    private GameService gameService;

    @GetMapping("/matchmaking")
    public String showMatchmakingForm(Model model) {
        List<Game> availableGames = gameService.findAvailableGames();
        model.addAttribute("availableGames", availableGames);
        return "matchmaking";
    }

    @PostMapping("/matchmaking")
    public String joinGame(@RequestParam("gameId") Long gameId) {
        gameService.joinGame(gameId);
        return "redirect:/gameplay";
    }
}