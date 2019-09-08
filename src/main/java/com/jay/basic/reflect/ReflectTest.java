package com.jay.basic.reflect;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.*;

/**
 * created by Jay on 2019/8/4
 */
public class ReflectTest
{
    protected int age = 10;

    public static void print(String name)
    {
        System.out.println("name:" + name);
    }


    @Test
    public void test()
    {
        Class clazz = ReflectTest.class;
        // 获取所有构造方法
        Constructor[] constructors = clazz.getConstructors();
        for (Constructor constructor : constructors)
        {
            System.out.println("constructor:" + constructor); //public com.jay.basic.reflect.ReflectTest()
        }
        /**
         * 获取所有的field，包括private, default, protected
         */
        Field[] fields1 = clazz.getDeclaredFields();
        /**
         * 只获取public类型的field
         */
        Field[] fields2 = clazz.getFields();
        int modifiers = clazz.getModifiers();
        // 获取所有方法， 包括从Object继承而来的方法
        Method[] methods = clazz.getMethods();
        for (Method method : methods)
        {
            if (!"print".equals(method.getName()))
            {
                continue;
            }

            // 获取所有参数
            Parameter[] parameters = method.getParameters();
            for (Parameter parameter : parameters)
            {
                //parameter type:java.lang.String, parameter name:arg0
                System.out.println("parameter type:" + parameter.getType().getName() + ", parameter name:" + parameter.getName());
            }
            // 获取修饰符
            int modifiers1 = method.getModifiers();
            // 获取返回值类型class
            Class returTypeClass = method.getReturnType();
            //returTypeClass:void
            System.out.println("returTypeClass:" + returTypeClass.getName());
            Type returnType = method.getGenericReturnType();
            //returnType:void
            System.out.println("returnType:" + returnType);
            // 获取参数值类型
            Class[] parameterTypeClasses = method.getParameterTypes();
            for (Class parameterTypeClass : parameterTypeClasses)
            {
                //parameterTypeClass:java.lang.String
                System.out.println("parameterTypeClass:" + parameterTypeClass.getName());
            }
            Type[] parameterTypes = method.getGenericParameterTypes();

            for (Type parameterType : parameterTypes)
            {
                //parameterType:java.lang.String
                System.out.println("parameterType:" + parameterType.getTypeName());
            }
        }
    }

    @Test
    public void testProxy()
    {
        Person person = (Person) new PersonInvocationHandler().getProxy(new Man());
        person.run();
    }
}
