
package com.game.vr.service;

import com.game.vr.entity.PlayerProfile;

public interface PlayerProfileService {
    PlayerProfile findPlayerProfileByPlayerName(String playerName);
    void savePlayerProfile(PlayerProfile playerProfile);
}
