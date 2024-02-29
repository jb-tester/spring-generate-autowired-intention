package com.example.springgenerateautowiredintention.beans;

/**
 * *
 * <p>Created by irina on 11/9/2022.</p>
 * <p>Project: spring-generate-autowired-intention</p>
 * *
 */
public class Bean5 {
    String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Bean5{" +
                "id='" + id + '\'' +

                '}';
    }
}
