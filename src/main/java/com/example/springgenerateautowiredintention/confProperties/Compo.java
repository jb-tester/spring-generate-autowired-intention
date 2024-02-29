package com.example.springgenerateautowiredintention.confProperties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * *
 * <p>Created by irina on 2/23/2024.</p>
 * <p>Project: spring-generate-autowired-intention</p>
 * *
 */
@Component
@ConfigurationProperties("new.props")
public class Compo {

    String prop0;
    String prop1;
    int prop2;
    boolean prop3;

    public String getProp0() {
        return prop0;
    }

    public void setProp0(String prop0) {
        this.prop0 = prop0;
    }

    public String getProp1() {
        return prop1;
    }

    public void setProp1(String prop1) {
        this.prop1 = prop1;
    }

    public int getProp2() {
        return prop2;
    }

    public void setProp2(int prop2) {
        this.prop2 = prop2;
    }

    public boolean isProp3() {
        return prop3;
    }

    public void setProp3(boolean prop3) {
        this.prop3 = prop3;
    }
}
