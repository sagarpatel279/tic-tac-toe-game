package com.games.tictactoe.application.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "humans")
public class HumanPlayer extends Player{
    public HumanPlayer(String name, Symbol symbol, PlayerType playerType) {
        super(name, symbol, playerType);
    }
}
