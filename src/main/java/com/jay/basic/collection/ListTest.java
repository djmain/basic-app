package com.jay.basic.collection;

import org.junit.Test;

import java.util.*;

/**
 * created by Jay on 2019/8/5
 */
public class ListTest
{

    @Test
    public void testListSort()
    {
        List<Integer> list = new ArrayList<>(Arrays.asList(3, 5, 2, 10));
        System.out.println(list); //[3, 5, 2, 10]
        list.sort(new Comparator<Integer>()
        {
            @Override
            public int compare(Integer o1, Integer o2)
            {
                return o1.compareTo(o2);
            }
        });
        System.out.println(list); //[2, 3, 5, 10]

        Collections.shuffle(list);
        System.out.println(list);
    }


    /**
     * 链表
     */
    @Test
    public void testLinkedList1()
    {
        List<String> list = new LinkedList<>();
        list.add("s1");
        list.add("s2");
        list.add("s3");
        list.add("s1");
        // [s1, s2, s3]
        System.out.println(list);
        list.remove("s1");
        System.out.println(list);

        LinkedList<String> list1 = new LinkedList<>();
        // 添加元素到List的尾部
        list1.add("s1");
        list1.add("s2");
        list1.add("s3");
        // [s1, s2, s3]
        System.out.println(list1);

        // s1
        System.out.println(list1.peek());
        // s1
        System.out.println(list1.element());
        // s1
//        System.out.println(list1.poll());
//        // [s2, s3]
//        System.out.println(list1);
//        // s2
//        System.out.println(list1.remove());
//        // [s3]
//        System.out.println(list1);
        System.out.println(list1.offer("s4"));
        //[s1, s2, s3, s4]
        System.out.println(list1);
        System.out.println(list1.offerFirst("s0"));
        System.out.println(list1.offerLast("s5"));
        //[s0, s1, s2, s3, s4, s5]
        System.out.println(list1);
        //s0
        System.out.println(list1.peekFirst());
        //s5
        System.out.println(list1.peekLast());
        //s0
        System.out.println(list1.pollFirst());
        //[s1, s2, s3, s4, s5]
        System.out.println(list1);

    }


    /**
     *
     */
    @Test
    public void testStackByLinkedList()
    {
        LinkedList<String> list = new LinkedList<>();
        list.push("s1");
        list.push("s2");
        list.push("s3");
        //[s3, s2, s1] 为什么与添加顺序相反? 链表添加元素的过程
        System.out.println(list);
        System.out.println(list.pop()); // s3
        System.out.println(list.pop()); // s2
        System.out.println(list.pop()); // s1
    }

    @Test
    public void testStack()
    {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        //[1, 2, 3]
        System.out.println(stack);
        System.out.println(stack.pop()); // 3
        System.out.println(stack.pop()); // 2
        System.out.println(stack.pop()); // 1
    }

    @Test
    public void testConcurrentModifactionException()
    {
        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "a", "c", "f"));
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext())
        {
            String e = iterator.next(); //java.util.ConcurrentModificationException
            if (e.startsWith("a"))
            {
                list.remove(e);
//                 iterator.remove();
            }
        }
        System.out.println(list);
    }


}
