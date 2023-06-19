
package com.game.vr.service;

import com.game.vr.entity.Player;
import com.game.vr.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PlayerServiceImpl implements PlayerService {
    @Autowired
    private PlayerRepository playerRepository;

    @Override
    public List<Player> findPlayersBySkillLevel(int skillLevel) {
        return playerRepository.findByAvailabilityTrueAndSkillLevelGreaterThanEqualOrderBySkillLevelAsc(skillLevel);
    }

    @Override
    public void savePlayer(Player player) {
        playerRepository.save(player);
    }
}
