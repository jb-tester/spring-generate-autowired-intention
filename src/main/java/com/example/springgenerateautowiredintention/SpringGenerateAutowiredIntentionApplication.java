package com.example.springgenerateautowiredintention;

import com.example.springgenerateautowiredintention.usages.TestInjectionIntoRecord;
import com.example.springgenerateautowiredintention.usages.TestInjectionToLombokComponent;
import com.example.springgenerateautowiredintention.usages.TestQuickfixesForBeans;
import com.example.springgenerateautowiredintention.usages.TestSetterInjection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringGenerateAutowiredIntentionApplication implements CommandLineRunner {

    /*@Autowired
    private TestQuickfixesForBeans testQuickfixesForBeans;
    @Autowired
    private TestInjectionToLombokComponent testInjectionToLombokComponent;
    @Autowired
    private TestInjectionIntoRecord testInjectionIntoRecord;
    @Autowired
    private TestSetterInjection testSetterInjection;*/

    public static void main(String[] args) {
        SpringApplication.run(SpringGenerateAutowiredIntentionApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
       /* testQuickfixesForBeans.display();
        testInjectionToLombokComponent.test();
        testInjectionIntoRecord.display();
        testSetterInjection.display();*/
    }
}
