package com.games.tictactoe.application.strategies.GameWinning;

import com.games.tictactoe.application.models.Board;
import com.games.tictactoe.application.models.Move;

public interface WinningStrategy {
    boolean checkWinner(Board board, Move move);
}
