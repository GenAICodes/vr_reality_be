
package com.game.vr.repository;

import com.game.vr.entity.Achievement;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface AchievementRepository extends JpaRepository<Achievement, Long> {
    List<Achievement> findByPointsGreaterThanEqual(int points);
}
