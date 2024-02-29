package com.example.springgenerateautowiredintention.components.items;

import org.springframework.stereotype.Component;

/**
 * *
 * <p>Created by irina on 10/18/2022.</p>
 * <p>Project: spring-generate-autowired-intention</p>
 * *
 */
@Component
public class FirstItem implements Item {
    @Override
    public String getId() {
        return "1_1";
    }
}
