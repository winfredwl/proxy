package com.winfred;

import com.winfred.staticproxy.Hello;
import com.winfred.staticproxy.HelloProxy;

/**
 * Created by Administrator on 2017/5/6 0006.
 */
public class TestMain {

    public static void main(String[] args) {
        Hello helloProxy = new HelloProxy();
        helloProxy.say("Jack");
    }
}
