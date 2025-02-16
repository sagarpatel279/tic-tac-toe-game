package com.games.tictactoe.application.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cell {
    private int row;
    private int col;
    private CellState cellState;
    private Symbol symbol;

    public Cell(int i, int j) {
        this.row=i;
        this.col=j;
    }

    public void display(){
        if(cellState==CellState.BLOCKED){
            System.out.print("|~|");
        }else if(cellState==CellState.EMPTY){
            System.out.print("|-|");
        }else{
            System.out.print("|"+symbol.getSymbol()+"|");
        }
    }
}
