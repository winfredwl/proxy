package com.winfred;

import com.winfred.dynamicproxy.DynamicProxy;
import com.winfred.staticproxy.Hello;
import com.winfred.staticproxy.HelloImpl;
import com.winfred.staticproxy.HelloProxy;

/**
 * @author Winfred.Wang
 * @since 1.0.0
 */
public class TestMain {

    public static void main(String[] args) {
//        Hello helloProxy = new HelloProxy();
//        helloProxy.say("Jack");

        DynamicProxy dynamicProxy = new DynamicProxy(new HelloImpl());
        Hello helloProxy = dynamicProxy.getProxy();

        helloProxy.say("Jack");
    }
}
