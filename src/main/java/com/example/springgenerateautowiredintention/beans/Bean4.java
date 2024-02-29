package com.example.springgenerateautowiredintention.beans;

/**
 * *
 * <p>Created by irina on 10/18/2022.</p>
 * <p>Project: spring-generate-autowired-intention</p>
 * *
 */
public class Bean4 {
    private final String id;


    public Bean4(String b) {
        this.id=b;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Bean4{" +
                "id='" + id + '\'' +
                '}';
    }
}
