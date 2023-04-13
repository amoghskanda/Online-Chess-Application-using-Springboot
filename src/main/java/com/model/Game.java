package com.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "games")
public class Game {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne(fetch = FetchType.LAZY)
    private users whitePlayer;
    
    @ManyToOne(fetch = FetchType.LAZY)
    private users blackPlayer;
    
    @OneToMany(mappedBy = "game", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Move> moves = new ArrayList<>();
    
    private String status;
    
    // Constructors, getters, and setters
    
    // Default constructor required by JPA
    public Game() {

    }
    
    public Game(users whitePlayer, users blackPlayer) {
        this.whitePlayer = whitePlayer;
        this.blackPlayer = blackPlayer;
        this.status = "ACTIVE";
    }
    
    // Getters and setters
    // ...

    // toString method for logging/debugging purposes
    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", whitePlayer=" + whitePlayer +
                ", blackPlayer=" + blackPlayer +
                ", moves=" + moves +
                ", status='" + status + '\'' +
                '}';
    }
}
    

