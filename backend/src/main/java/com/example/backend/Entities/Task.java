package com.example.backend.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Task {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private boolean completed;

    // Constructors
    public Task() {}
    public Task(String name) {this.name = name;}

    // Getters
    public Long getId() {return id;}
    public String getName() {return name;}

    // Setters
    public void setName(String name) {this.name = name;}

    public boolean isCompleted() {return completed;}
    public void setCompleted(boolean completed) {this.completed = completed;}
}
