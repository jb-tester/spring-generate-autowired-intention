package com.example.springgenerateautowiredintention.usages;

import com.example.springgenerateautowiredintention.beans.Bean4;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * *
 * <p>Created by irina on 11/9/2022.</p>
 * <p>Project: spring-generate-autowired-intention</p>
 * *
 */
@Component
//@RequiredArgsConstructor
//@Accessors
@AllArgsConstructor
//@Setter
//@Getter
public class TestInjectionToLombokComponent {


    @Qualifier("third_bean4")
    private final Bean4 bean4;

    public void test(){

        System.out.println(bean4.getId());
    }
}
