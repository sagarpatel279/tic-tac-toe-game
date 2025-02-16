package com.games.tictactoe.application.strategies.GameWinning;

import com.games.tictactoe.application.models.Board;
import com.games.tictactoe.application.models.Move;
import com.games.tictactoe.application.models.Symbol;

import java.util.HashMap;
import java.util.Map;

public class ColumnWinningStrategy implements WinningStrategy{
    private final Map<Integer,Map<Symbol,Integer>> colsMap=new HashMap<>();
    @Override
    public boolean checkWinner(Board board, Move move) {
        int col=move.getCell().getCol();
        Symbol symbol=move.getPlayer().getSymbol();

        if(!colsMap.containsKey(col)){
            colsMap.put(col,new HashMap<>());
        }
        int symbolCount=1;
        Map<Symbol,Integer> currentColMap=colsMap.get(col);
        if(currentColMap.containsKey(symbol)){
            symbolCount+=currentColMap.get(symbol);
        }
        currentColMap.put(symbol,symbolCount);
        return symbolCount==board.getDimension();
    }
}
