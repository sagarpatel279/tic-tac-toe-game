package com.games.tictactoe.application.strategies.BotPlaying;

import com.games.tictactoe.application.models.*;

import java.util.List;

public class EasyBotPlayingStrategy implements  BotPlayingStrategy{
    @Override
    public Move makeMove(Board board, Player player) {
        List<List<Cell>> grid=board.getGrid();
        for(List<Cell> cells:grid){
            for(Cell cell:cells){
                if(cell.getCellState()== CellState.EMPTY){
                    cell.setCellState(CellState.FILLED);
                    cell.setSymbol(player.getSymbol());
                    return new Move(player,cell);
                }
            }
        }
        return null;
    }
}
