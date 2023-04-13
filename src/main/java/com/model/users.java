package com.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class users {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotBlank
    @Size(max = 50)
    private String username;
    
    @NotBlank
    @Size(max = 120)
    private String password;
    
    @Nonnull
    private Integer rating;
    
    // Constructors, getters, and setters
    
    // Default constructor required by JPA
    public users() {

    }
    
    public users(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    // Getters and setters
    // ...

    // toString method for logging/debugging purposes
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", rating=" + rating +
                '}';
    }

    public void setRating(int i) {
    }

    public String getUsername() {
        return null;
    }
}
    

