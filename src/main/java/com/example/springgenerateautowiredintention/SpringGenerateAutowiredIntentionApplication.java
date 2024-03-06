package com.example.springgenerateautowiredintention;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringGenerateAutowiredIntentionApplication implements CommandLineRunner {

@Autowired
ApplicationContext ctx;

    public static void main(String[] args) {
        SpringApplication.run(SpringGenerateAutowiredIntentionApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        for (String s : ctx.getBeanDefinitionNames()) {
            System.out.println(s);
        }
    }
}
