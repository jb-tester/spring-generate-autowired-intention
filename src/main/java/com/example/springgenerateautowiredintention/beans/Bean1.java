package com.example.springgenerateautowiredintention.beans;

public class Bean1 {

    private final String id;

    public Bean1(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {

        return "Bean1{" +
                "id='" + id + '\'' +
                '}';
    }
}