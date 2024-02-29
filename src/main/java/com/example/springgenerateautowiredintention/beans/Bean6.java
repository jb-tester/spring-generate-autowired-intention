package com.example.springgenerateautowiredintention.beans;

import org.springframework.beans.factory.annotation.Value;

/**
 * *
 * <p>Created by irina on 11/10/2022.</p>
 * <p>Project: spring-generate-autowired-intention</p>
 * *
 */
public class Bean6 {


    public void doSmth(){

        //String id = abc.getId();
        System.out.println("bean6!!!");
    }

    @Override
    public String toString() {

        return "Bean6{}";
    }
}
