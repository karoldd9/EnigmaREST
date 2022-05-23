package com.enigma.EnigmaREST.beans;

public class Task {
    private String name;

    public Task(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Task: "+name;
    }
}
