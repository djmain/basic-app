package com.jay.basic.bit;

import org.junit.Test;

/**
 * 位运算
 * created by Jay on 2019/7/31
 */
public class BitTest
{
    /**
     * 测试左移运算
     */
    @Test
    public void testLeftMove()
    {
        byte byteValue = 9;
        System.out.println(Integer.toBinaryString(byteValue)); //1001
        System.out.println(byteValue << 1); //18
        System.out.println(byteValue << 2); //36
        System.out.println(byteValue << 3);
        System.out.println(byteValue << 4);
        System.out.println(byteValue << 5);
        System.out.println(byteValue << 27); //1207959552
        System.out.println(byteValue << 28); //-1879048192

        System.out.println("----");
        long longValue = 9L;
        System.out.println(longValue << 27); //1207959552
        System.out.println(longValue << 28); //2415919104
        System.out.println(longValue << 40); //9895604649984
        System.out.println(longValue << 60); //-8070450532247928832

        System.out.println("----");
        byte b = -9;
        System.out.println(Integer.toBinaryString(b)); //自动提升为int类型, 11111111111111111111111111110111
        System.out.println(b << 1); //-18
        System.out.println(b << 2); //-36
    }
}
