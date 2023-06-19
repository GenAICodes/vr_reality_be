
package com.game.vr.repository;

import com.game.vr.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface PlayerRepository extends JpaRepository<Player, Long> {
    List<Player> findByAvailabilityTrueAndSkillLevelGreaterThanEqualOrderBySkillLevelAsc(int skillLevel);
}
