package com.games.tictactoe.application.factories;

import com.games.tictactoe.application.exceptions.InvalidBotDifficultyLevel;
import com.games.tictactoe.application.models.BotDifficultyLevel;
import com.games.tictactoe.application.strategies.BotPlaying.BotPlayingStrategy;
import com.games.tictactoe.application.strategies.BotPlaying.EasyBotPlayingStrategy;
import com.games.tictactoe.application.strategies.BotPlaying.HardBotPlayingStrategy;
import com.games.tictactoe.application.strategies.BotPlaying.MediumBotPlayingStrategy;

public class BotPlayingFactory {
    public static BotPlayingStrategy getBotPlayingStrategy(BotDifficultyLevel botDifficultyLevel) throws InvalidBotDifficultyLevel {
        return switch (botDifficultyLevel) {
            case EASY -> new EasyBotPlayingStrategy();
            case MEDIUM -> new MediumBotPlayingStrategy();
            case HARD -> new HardBotPlayingStrategy();
            default -> throw new InvalidBotDifficultyLevel("Invalid Bot Difficulty Level to Play");
        };
    }
}
