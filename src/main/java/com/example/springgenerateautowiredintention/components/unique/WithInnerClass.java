package com.example.springgenerateautowiredintention.components.unique;
import org.springframework.stereotype.Component;

@Component("parent")
public class WithInnerClass {

    public void method() {
        // try to complete the inner bean here
    }

    @Component
    public static class InnerClass {
        @Override
        public String toString() {
            return "InnerClass{}";
        }
    }
}
