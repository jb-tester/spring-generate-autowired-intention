package com.example.springgenerateautowiredintention.beans;

/**
 * *
 * <p>Created by irina on 10/18/2022.</p>
 * <p>Project: spring-generate-autowired-intention</p>
 * *
 */
public class Bean2 {
    private final String id;

    public Bean2(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Bean2{" +
                "id='" + id + '\'' +
                '}';
    }
}
