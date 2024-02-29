package com.example.springgenerateautowiredintention.usages;

import com.example.springgenerateautowiredintention.beans.Bean0;
import com.example.springgenerateautowiredintention.beans.Bean2;
import com.example.springgenerateautowiredintention.beans.Bean6;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TestSetterInjectionByCompletion {


    private Bean2 bean22;

    // try beans injections by completion inside the method: the setter injection style should be preserved
    public void display(){
        System.out.println("======= setter injection test:");
        System.out.println(bean0);


    }
    private void someDummyMethodWithLongBody(){
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

    }
    private Bean0 bean0;
    private Bean6 bean6;

    @Autowired
    public void setBean0(Bean0 bean0) {
        this.bean0 = bean0;
    }

    @Autowired
    public void setBean6(Bean6 bean6) {
        this.bean6 = bean6;
    }

    @Qualifier("bean22")
    @Autowired
    public void setBean22(Bean2 bean22) {
        this.bean22 = bean22;
    }
}
