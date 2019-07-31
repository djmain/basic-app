package com.jay.basic.bit;

import org.junit.Test;

/**
 * 位运算
 * created by Jay on 2019/7/31
 */
public class BitTest
{

    /**
     * 测试进制表示法及进制转换
     */
    @Test
    public void testDecimal()
    {
        // 二进制数表示方法, 1000是十进制表示法, 前面加上0b即0b1000表示二进制表示法
        int binValue = 0b1000;
        // 八进制数表示方法, 123是十进制表示法, 前面加上0即0123表示八进制表示法
        int octValue = 0123;
        // 十进制数表示方法
        int decValue = 225;
        // 十六进制数表示方法 前面加上0x表示十六进制表示法
        int hexValue = 0xFF22;
        System.out.println(binValue); //8
        System.out.println(octValue); //83
        System.out.println(decValue); //225
        System.out.println(hexValue); //65314

        // 十六进制转换为八进制
        System.out.println(Integer.toOctalString(hexValue)); //177442
    }


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

    @Test
    public void testRightMove()
    {
        byte byteValue = 8;
        System.out.println(Integer.toBinaryString(byteValue)); //1000
        System.out.println(byteValue >> 1); // 4
        System.out.println(byteValue >> 2); // 2
        System.out.println(byteValue >> 3); // 1
        System.out.println(byteValue >> 4); // 0
        System.out.println(byteValue >> 5); // 0

        System.out.println("----");
        byte byteValue1 = -8;
        System.out.println(Integer.toBinaryString(byteValue1)); //11111111111111111111111111111000
        System.out.println(byteValue1 >> 1);  // -4
        System.out.println(byteValue1 >> 2);  // -2
        System.out.println(byteValue1 >> 3);  // -1
        System.out.println(byteValue1 >> 4);  // -1
        System.out.println(byteValue1 >> 20); // -1  (二进制:‭11111111111111111111111111111111 ‬//)
    }
}
