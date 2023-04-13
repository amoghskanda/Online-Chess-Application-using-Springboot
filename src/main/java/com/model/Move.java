package com.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "moves")
public class Move {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne(fetch = FetchType.LAZY)
    private Game game;
    
    private int moveNumber;
    
    private String moveText;
    
    // Constructors, getters, and setters
    
    // Default constructor required by JPA
    public Move() {}
    
    public Move(Game game, int moveNumber, String moveText) {
        this.game = game;
        this.moveNumber = moveNumber;
        this.moveText = moveText;
    }
    
    // Getters and setters
    // ...

    // toString method for logging/debugging purposes
    @Override
    public String toString() {
        return "Move{" +
                "id=" + id +
                ", game=" + game +
                ", moveNumber=" + moveNumber +
                ", moveText='" + moveText + '\'' +
                '}';
    }
}