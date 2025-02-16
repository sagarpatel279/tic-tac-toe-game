package com.games.tictactoe.application.models;


import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity(name="players")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Player extends BaseModel {
    private String name;
    private Symbol symbol;
    private PlayerType playerType;
    public Player(String name,Symbol symbol,PlayerType playerType){
        this.name=name;
        this.symbol=symbol;
        this.playerType=playerType;
    }
}
