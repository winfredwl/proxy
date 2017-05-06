package com.winfred.staticproxy;

/**
 * @author Winfred.Wang
 * @since 1.0.0
 */
public class HelloProxy implements Hello{

    private Hello hello;

    public HelloProxy() {
        hello = new HelloImpl();
    }

    @Override
    public void say(String name) {
        before();
        hello.say(name);
        after();
    }

    private void before() {
        System.out.println("Before");
    }

    private void after() {
        System.out.println("After");
    }
}
