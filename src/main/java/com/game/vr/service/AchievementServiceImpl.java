
package com.game.vr.service;

import com.game.vr.entity.Achievement;
import com.game.vr.repository.AchievementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AchievementServiceImpl implements AchievementService {
    @Autowired
    private AchievementRepository achievementRepository;

    @Override
    public List<Achievement> findAchievementsByPoints(int points) {
        return achievementRepository.findByPointsGreaterThanEqual(points);
    }

    @Override
    public void saveAchievement(Achievement achievement) {
        achievementRepository.save(achievement);
    }
}
