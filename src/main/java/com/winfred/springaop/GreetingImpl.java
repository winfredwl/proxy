package com.winfred.springaop;

import org.springframework.stereotype.Component;

/**
 * @author Winfred.Wang
 * @since 1.0.0
 */
@Component
public class GreetingImpl implements Greeting {

    @Override
    public void sayHello(String name) {
        System.out.println("Hello! " + name);

//        throw new RuntimeException("Error");
    }
}
