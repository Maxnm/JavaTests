package com.geekbrains.tests;

import java.util.Arrays;
import java.util.Scanner;

public class Test1Perevorot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Создается массив случайной длинны;
        double a = Math.random() * 20;
        int b = (int) a;
        int[] list = new int[b];

        //Заполняется массив
        for (int i = 0; i < list.length; i++) {
            double c = Math.random() * 10;
            int f = (int) c * i;
            list[i] = i + f;
        }

        System.out.println(Arrays.toString(list));
        //сортировка со сменой массива наоборот
        for (int i = 0; i < list.length / 2; i++) {
            int tmp = list[i];
            list[i] = list[list.length - 1 - i];
            list[list.length - 1 - i] = tmp;
        }
        System.out.println(Arrays.toString(list));
    }
}
