
package com.game.vr.service;

import com.game.vr.entity.Player;
import java.util.List;

public interface PlayerService {
    List<Player> findPlayersBySkillLevel(int skillLevel);
    void savePlayer(Player player);
}
