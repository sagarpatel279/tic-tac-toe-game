package com.games.tictactoe.application.models;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Move {
    private Cell cell;
    private Player player;
}
