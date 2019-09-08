package com.jay.basic.a01;

/**
 * created by Jay on 2019/8/13
 */
class A
{
    int i = 10;

    void f()
    {
        int i = 100;
        System.out.println(this.i);//全局
        System.out.println(i);//局部
    }
}