package com.games.tictactoe.application.strategies.GameWinning;

import com.games.tictactoe.application.models.Board;
import com.games.tictactoe.application.models.Move;
import com.games.tictactoe.application.models.Symbol;

import java.util.HashMap;
import java.util.Map;

public class RowWinningStrategy implements WinningStrategy{
    private final Map<Integer,Map<Symbol,Integer>> rowsMap=new HashMap<>();
    @Override
    public boolean checkWinner(Board board, Move move) {
        int row=move.getCell().getRow();
        Symbol symbol=move.getPlayer().getSymbol();

        if(!rowsMap.containsKey(row)){
            rowsMap.put(row,new HashMap<>());
        }
        int symbolCount=1;

        Map<Symbol,Integer> currentRowMap=rowsMap.get(row);
        if(currentRowMap.containsKey(symbol)){
            symbolCount+=currentRowMap.get(symbol);
        }
        currentRowMap.put(symbol,symbolCount);
        return symbolCount==board.getDimension();
    }
}
