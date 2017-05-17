package com.winfred.springaop;

/**
 * @author Winfred.Wang
 * @since 1.0.0
 */
public class GreetingImpl implements Greeting {

    @Override
    public void sayHello(String name) {
        System.out.println("Hello! " + name);
    }
}
