package com.example.springgenerateautowiredintention.components.animals;

import org.springframework.stereotype.Component;

/**
 * *
 * <p>Created by irina on 10/18/2022.</p>
 * <p>Project: spring-generate-autowired-intention</p>
 * *
 */
@Component
public class Cat implements Animal {


    @Override
    public String getId() {
        return "cat";
    }
}
