package com.games.tictactoe.application.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "bots")
public class BotPlayer extends Player{
    private BotDifficultyLevel botDifficultyLevel;

    public BotPlayer(String name, Symbol symbol, PlayerType playerType,BotDifficultyLevel botDifficultyLevel) {
        super(name, symbol, playerType);
        this.botDifficultyLevel=botDifficultyLevel;
    }
}
