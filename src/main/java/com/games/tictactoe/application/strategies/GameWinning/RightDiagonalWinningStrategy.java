package com.games.tictactoe.application.strategies.GameWinning;

import com.games.tictactoe.application.models.Board;
import com.games.tictactoe.application.models.Move;
import com.games.tictactoe.application.models.Symbol;

import java.util.HashMap;
import java.util.Map;

public class RightDiagonalWinningStrategy implements WinningStrategy{
    private final Map<Symbol,Integer> rightDiagonalMap=new HashMap<>();
    @Override
    public boolean checkWinner(Board board, Move move) {
        int row=move.getCell().getRow();
        int col=move.getCell().getCol();
        Symbol symbol=move.getPlayer().getSymbol();
        int symbolCount=1;

        if((row+col)==board.getDimension()-1){
            if(rightDiagonalMap.containsKey(symbol)) {
                symbolCount += rightDiagonalMap.get(symbol);
            }
            rightDiagonalMap.put(symbol,symbolCount);
        }
        return symbolCount==board.getDimension();
    }
}
