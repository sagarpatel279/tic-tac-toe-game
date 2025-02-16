package com.games.tictactoe.application.strategies.BotPlaying;

import com.games.tictactoe.application.models.Board;
import com.games.tictactoe.application.models.Move;
import com.games.tictactoe.application.models.Player;

public interface BotPlayingStrategy {
    Move makeMove(Board board, Player player);
}
