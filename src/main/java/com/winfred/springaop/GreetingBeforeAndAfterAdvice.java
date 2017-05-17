package com.winfred.springaop;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author Winfred.Wang
 * @since 1.0.0
 */
public class GreetingBeforeAndAfterAdvice implements MethodBeforeAdvice, AfterReturningAdvice{

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("Before");
    }

    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("After");
    }
}
