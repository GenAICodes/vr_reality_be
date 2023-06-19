
package com.game.vr.controller;

import com.game.vr.entity.Achievement;
import com.game.vr.service.AchievementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/achievements")
public class AchievementController {
    @Autowired
    private AchievementService achievementService;

    @GetMapping
    public List<Achievement> getAchievementsByPoints(@RequestParam int points) {
        return achievementService.findAchievementsByPoints(points);
    }

    @PostMapping
    public void saveAchievement(@RequestBody Achievement achievement) {
        achievementService.saveAchievement(achievement);
    }
}
