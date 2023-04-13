package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.Game;
import com.services.GameService;

@Controller
public class GameplayController {

    @Autowired
    private GameService gameService;

    @GetMapping("/gameplay")
    public String playGame(Model model) {
        Game game = gameService.getCurrentGame();
        model.addAttribute("game", game);
        return "gameplay";
    }

    @PostMapping("/gameplay")
    public String makeMove(@RequestParam("fromX") int fromX, @RequestParam("fromY") int fromY,
                           @RequestParam("toX") int toX, @RequestParam("toY") int toY) {
        gameService.makeMove(fromX, fromY, toX, toY);
        return "redirect:/gameplay";
    }
}
    

