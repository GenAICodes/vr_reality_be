
package com.game.vr.repository;

import com.game.vr.entity.GameState;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface GameStateRepository extends JpaRepository<GameState, Long> {
    List<GameState> findByState(String state);
}
