package com.example.springgenerateautowiredintention;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * *
 * <p>Created by irina on 2/15/2024.</p>
 * <p>Project: spring-generate-autowired-intention</p>
 * *
 */
@Component
public class TestCompo1 {

    @Value("test1")
    String id;

    public String getId() {
        return id;
    }

}
