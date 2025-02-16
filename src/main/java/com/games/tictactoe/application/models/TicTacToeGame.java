package com.games.tictactoe.application.models;

import com.games.tictactoe.application.exceptions.InvalidDimensionOrPlayerList;
import com.games.tictactoe.application.strategies.GameWinning.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
public class TicTacToeGame extends BaseModel{
    private List<Player> players;
    private int currentPlayerId;
    private Player winner;
    private List<WinningStrategy> winningStrategies;
    private Board board;
    private List<Move> moves;
    private GameState gameState;
    private TicTacToeGame(GameBuilder builder){
        this.players=builder.players;
        currentPlayerId=0;
        winner=null;
        winningStrategies=List.of(new RowWinningStrategy(),new ColumnWinningStrategy(),new LeftDiagonalWinningStrategy(),new RightDiagonalWinningStrategy());
        board=new Board(builder.dimension);
        moves=new ArrayList<>();
        gameState=GameState.ON_GOING;
    }

    public static class GameBuilder{
        private List<Player> players;
        private int dimension;

        public GameBuilder setDimension(int dimension){
            this.dimension=dimension;
            return this;
        }

        public GameBuilder setPlayers(List<Player> players) throws InvalidDimensionOrPlayerList {
            validatePlayers(players);
            this.players=players;
            return this;
        }
        public TicTacToeGame getBuild(){
            return new TicTacToeGame(this);
        }
        private void validatePlayers(List<Player> players) throws InvalidDimensionOrPlayerList {
            if(dimension!=players.size()-1){
                throw new InvalidDimensionOrPlayerList("Invalid dimension choose n dimension and n-1 players");
            }
            Set<Character> symbolSet=new HashSet<>();
            for(Player player:players){
                if(symbolSet.contains(player.getSymbol().getMark())){
                    throw new IllegalArgumentException("Duplicate Symbols found for the given players");
                }
                symbolSet.add(player.getSymbol().getMark());
            }
        }
    }
}
