package com.winfred.springaop;

import org.springframework.aop.framework.ProxyFactory;

/**
 * @author Winfred.Wang
 * @since 1.0.0
 */
public class Client {

    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setTarget(new GreetingImpl());
//        proxyFactory.addAdvice(new GreetingBeforeAdvice());
//        proxyFactory.addAdvice(new GreetingAfterAdvice());
//        proxyFactory.addAdvice(new GreetingBeforeAndAfterAdvice());
        proxyFactory.addAdvice(new GreetingAroundAdvice());

        Greeting greeting = (Greeting) proxyFactory.getProxy();

        greeting.sayHello("Jack");
    }
}
