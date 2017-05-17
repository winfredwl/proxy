package com.winfred.springaop;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Winfred.Wang
 * @since 1.0.0
 */
public class Client {

    public static void main(String[] args) {
//        ProxyFactory proxyFactory = new ProxyFactory();
//        proxyFactory.setTarget(new GreetingImpl());
////        proxyFactory.addAdvice(new GreetingBeforeAdvice());
////        proxyFactory.addAdvice(new GreetingAfterAdvice());
////        proxyFactory.addAdvice(new GreetingBeforeAndAfterAdvice());
//        proxyFactory.addAdvice(new GreetingAroundAdvice());
//
//        Greeting greeting = (Greeting) proxyFactory.getProxy();

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Greeting greeting = (Greeting) context.getBean("greetingProxy");
//        greeting.sayHello("Jack");
        GreetingImpl greetingImpl = (GreetingImpl) context.getBean("greetingProxy");
        greetingImpl.sayHello("Jack");

        Apology apology = (Apology) greetingImpl; // 将目标强制向上转型为Apology接口
        apology.saySorry("Jack'");
    }
}
