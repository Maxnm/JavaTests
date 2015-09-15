package com.geekbrains.tests;

import java.util.TreeMap;

/**
 * @Author Max
 * @Date 15.09.2015
 * @Version JDK 1.8
 * @Purpose Education
 */
public class Test3Treemap {
    public static void main(String[] args) {
        TreeMap<Integer, Integer> t = new TreeMap<>();

        double r = Math.random() * 10;
        int rand = (int) r;

        for (int i = 1; i < rand * 3; i++) {
            t.put(i, i * rand);
        }
        t.put(3, 3);
        t.put(1, 4);






        System.out.println(t);
    }


}
