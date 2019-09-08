package com.jay.basic.a01;

import org.junit.Test;

/**
 * created by Jay on 2019/8/13
 */
public class Book
{
    private static int age = 10;


    public static void main(String[] args)
    {
        int age =20;
        System.out.println(age);
//        book.Book();
    }

    public Book()
    {
        System.out.println("constructor -- book.");
    }


    public void Book()
    {
        System.out.println("call method:Book()");
    }
}
