
package com.game.vr.service;

import com.game.vr.entity.PlayerProfile;
import com.game.vr.repository.PlayerProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerProfileServiceImpl implements PlayerProfileService {
    @Autowired
    private PlayerProfileRepository playerProfileRepository;

    @Override
    public PlayerProfile findPlayerProfileByPlayerName(String playerName) {
        return playerProfileRepository.findByPlayerName(playerName);
    }

    @Override
    public void savePlayerProfile(PlayerProfile playerProfile) {
        playerProfileRepository.save(playerProfile);
    }
}
