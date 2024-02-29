package com.example.springgenerateautowiredintention.components.unique;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * *
 * <p>Created by irina on 11/21/2022.</p>
 * <p>Project: spring-generate-autowired-intention</p>
 * *
 */
@Component("fooBarBuzzComponent")
public class FooBarBuzz {

    @Value("FooBarBuzz")
    String id;

    public String getId() {
        return id;
    }
}
