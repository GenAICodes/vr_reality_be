
package com.game.vr.repository;

import com.game.vr.entity.PlayerProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerProfileRepository extends JpaRepository<PlayerProfile, Long> {
    PlayerProfile findByPlayerName(String playerName);
}
