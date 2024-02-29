package com.example.springgenerateautowiredintention.usages;

import com.example.springgenerateautowiredintention.beans.Bean1;
import com.example.springgenerateautowiredintention.beans.Bean4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class TestQuickfixesForBeans {


    @Autowired
    private Bean1 bean1;

    @Qualifier("third_bean4")
    @Autowired
    private Bean4 bean4;
    @Qualifier("third_bean4")
    @Autowired
    private Bean4 bean41;

    public void display() {





    }

}
