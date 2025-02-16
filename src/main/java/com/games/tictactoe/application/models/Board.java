package com.games.tictactoe.application.models;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Board {
    private int dimension;
    private List<List<Cell>> grid;
    public Board(int dimension){
        this.dimension=dimension;
        this.grid=new ArrayList<>();
        for(int i=0;i<dimension;i++){
            List<Cell> cells=new ArrayList<>();
            for(int j=0;j<dimension;j++){
                cells.add(new Cell(i,j));
            }
            grid.add(cells);
        }
    }

    public void display(){
        for (List<Cell> cells : grid) {
            for (Cell cell : cells) {
                cell.display();
            }
            System.out.println();
        }
    }
}
