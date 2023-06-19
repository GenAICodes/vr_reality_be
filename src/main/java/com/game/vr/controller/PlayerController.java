
package com.game.vr.controller;

import com.game.vr.entity.Player;
import com.game.vr.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/players")
public class PlayerController {
    @Autowired
    private PlayerService playerService;

    @GetMapping
    public List<Player> getPlayersBySkillLevel(@RequestParam int skillLevel) {
        return playerService.findPlayersBySkillLevel(skillLevel);
    }

    @PostMapping
    public void savePlayer(@RequestBody Player player) {
        playerService.savePlayer(player);
    }
}
