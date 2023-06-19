
package com.game.vr.controller;

import com.game.vr.entity.PlayerProfile;
import com.game.vr.service.PlayerProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/playerprofiles")
public class PlayerProfileController {
    @Autowired
    private PlayerProfileService playerProfileService;

    @GetMapping
    public PlayerProfile getPlayerProfileByPlayerName(@RequestParam String playerName) {
        return playerProfileService.findPlayerProfileByPlayerName(playerName);
    }

    @PostMapping
    public void savePlayerProfile(@RequestBody PlayerProfile playerProfile) {
        playerProfileService.savePlayerProfile(playerProfile);
    }
}
