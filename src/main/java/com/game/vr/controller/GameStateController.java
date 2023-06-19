
package com.game.vr.controller;

import com.game.vr.entity.GameState;
import com.game.vr.service.GameStateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/gamestates")
public class GameStateController {
    @Autowired
    private GameStateService gameStateService;

    @GetMapping
    public List<GameState> getGameStatesByState(@RequestParam String state) {
        return gameStateService.findGameStatesByState(state);
    }

    @PostMapping
    public void saveGameState(@RequestBody GameState gameState) {
        gameStateService.saveGameState(gameState);
    }
}
