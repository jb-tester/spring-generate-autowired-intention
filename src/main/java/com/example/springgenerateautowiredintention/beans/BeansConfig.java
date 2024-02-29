package com.example.springgenerateautowiredintention.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


@Configuration
public class BeansConfig {
    @Bean
    public Bean1 bean1() {
        return new Bean1("b1");
    }

    @Bean
    public Bean0 bean0() {
        return new Bean0("b0");
    }
    @Bean
    public Bean2 bean21() {
        return new Bean2("b21");
    }
    @Bean
    public Bean2 bean22() {
        return new Bean2("b22");
    }

    @Primary
    @Bean
    public Bean3 bean31(){
        return new Bean3("b31");
    }

    @Bean
    public Bean3 bean32() {
        return new Bean3("b32");
    }

    @Bean
    public Bean3 bean33() {
        return new Bean3("b33");
    }

    @Bean("bean4") @Qualifier("third_bean4")
    public Bean4 bean43() {
        return new Bean4("b43(third)");
    }

    @Bean("bean4") @Qualifier("secondary_bean4")
    public Bean4 bean42() {
        return new Bean4("b42(sec)");
    }

    @Bean("bean4") @Qualifier("primary_bean4") //@Primary
    public Bean4 bean41() {

        return new Bean4("b41(prim)");
    }

    @Bean
    public Bean6 bean6() {
        return new Bean6();
    }
    @Bean
    public Bean5 bean5() {
        Bean5 bean5 = new Bean5();
        bean5.setId("b5");
        return bean5;
    }

}
