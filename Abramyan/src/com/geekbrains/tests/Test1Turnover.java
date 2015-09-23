package com.geekbrains.tests;

import java.util.Arrays;
import java.util.Random;
/*
 * Description: To perform turning of an array upside down
 */

public class Test1Turnover {
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

        System.out.println(Arrays.toString(list));

        //Sorting the array upside down
        for (int i = 0; i < list.length / 2; i++) {
            int tmp = list[i];
            list[i] = list[list.length - 1 - i];
            list[list.length - 1 - i] = tmp;
        }
        System.out.println(Arrays.toString(list));
    }
}
