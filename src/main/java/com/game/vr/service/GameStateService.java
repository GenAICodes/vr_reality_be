
package com.game.vr.service;

import com.game.vr.entity.GameState;
import java.util.List;

public interface GameStateService {
    List<GameState> findGameStatesByState(String state);
    void saveGameState(GameState gameState);
}
