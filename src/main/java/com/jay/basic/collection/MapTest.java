package com.jay.basic.collection;

import org.junit.Test;
import sun.rmi.runtime.Log;

import java.util.*;

/**
 * created by Jay on 2019/8/5
 */
public class MapTest
{
    @Test
    public void testMap1()
    {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < 10000; i++) { map.put(i + "", i);}
        long begin = new Date().getTime();
        Set<String> set = map.keySet();
        for (String key : set) { System.out.println(map.get(key));}
        long cost1 = new Date().getTime() - begin;
        begin = new Date().getTime();
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) { System.out.println(entry.getValue());}
        long cost2 = new Date().getTime() - begin;
        System.out.println(cost1 + ":" + cost2);
    }

}
