
package com.game.vr.service;

import com.game.vr.entity.GameState;
import com.game.vr.repository.GameStateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class GameStateServiceImpl implements GameStateService {
    @Autowired
    private GameStateRepository gameStateRepository;

    @Override
    public List<GameState> findGameStatesByState(String state) {
        return gameStateRepository.findByState(state);
    }

    @Override
    public void saveGameState(GameState gameState) {
        gameStateRepository.save(gameState);
    }
}
