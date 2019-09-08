package com.jay.basic.collection;

import org.junit.Test;

import java.util.*;

/**
 * created by Jay on 2019/8/5
 */
public class SetTest
{
    @Test
    public void testLinkedHashSet()
    {
        Set<Integer> set = new LinkedHashSet<>();
        set.add(1);
        set.add(1);
        set.add(5);
        set.add(3);
        set.add(3);
        set.add(2);
        set.add(10);
        set.add(null);
        System.out.println(set);

        Set<Book> books = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2)
            {
                return 0;
            }
        });
        books.add(new Book());
        System.out.println(books);
    }


}
