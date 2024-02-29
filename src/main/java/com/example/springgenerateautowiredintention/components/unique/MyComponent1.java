package com.example.springgenerateautowiredintention.components.unique;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * *
 * <p>Created by irina on 10/19/2022.</p>
 * <p>Project: spring-generate-autowired-intention</p>
 * *
 */
@Component("my-bar-compo")
public class MyComponent1 {

    @Value("MyCompo")
    String id;

    public String getId() {
        return id;
    }
}
