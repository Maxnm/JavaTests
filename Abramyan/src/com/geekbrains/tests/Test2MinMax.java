package com.geekbrains.tests;

import java.util.Arrays;
import java.util.Random;

/**
 * @Author Max
 * @Date 15.09.2015
 * @Version JDK 1.8
 * @Purpose Education
 * <p>
 * Description: To find the greatest element of an array and average amount
 */
public class Test2MinMax {
    public static void main(String[] args) {

        Random r = new Random();

        //Creating new array with random length 1-20;
        int b = r.nextInt(20);
        int[] list = new int[b];

        //Filling it with numbers
        for (int i = 0; i < list.length; i++) {
            int f = r.nextInt(10) * i;
            list[i] = i + f;
        }

        //Default data for maximum and sum
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int aList : list) {
            //Sum of all array elements
            sum = sum + aList;

            //Checking maximum
            if (aList > max) {
                max = aList;
            }
        }

        //Calculating average
        int average = sum / list.length;

        System.out.println(Arrays.toString(list));
        System.out.println("Maximum is " + max);
        System.out.println("Average is " + average);
    }
}
