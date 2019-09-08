package com.jay.basic.reflect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * created by Jay on 2019/8/4
 */
public class PersonInvocationHandler implements InvocationHandler
{
    private Object target;

    public Object getProxy(Object target)
    {
        this.target = target;
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
    {
        System.out.println("prepare");
        return method.invoke(this.target, args);
    }
}
