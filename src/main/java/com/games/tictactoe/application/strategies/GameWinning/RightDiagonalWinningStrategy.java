package com.games.tictactoe.application.strategies.GameWinning;

import com.games.tictactoe.application.models.Board;
import com.games.tictactoe.application.models.Move;

public class RightDiagonalWinningStrategy implements WinningStrategy{
    @Override
    public boolean checkWinner(Board board, Move move) {
        return false;
    }
}
