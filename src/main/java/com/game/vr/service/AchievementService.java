
package com.game.vr.service;

import com.game.vr.entity.Achievement;
import java.util.List;

public interface AchievementService {
    List<Achievement> findAchievementsByPoints(int points);
    void saveAchievement(Achievement achievement);
}
