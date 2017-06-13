package service;

import entities.Player;
import mapper.PlayerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {
    private final PlayerMapper playerMapper;

    @Autowired
    public PlayerService(PlayerMapper playerMapper) {
        this.playerMapper = playerMapper;
    }

    public boolean hasAccount(Player player){
        return this.playerMapper.selectAccount(player)>0;
    }

    public boolean insertPlayer(Player player){
        return this.playerMapper.insertPlayer(player)>0;
    }
}