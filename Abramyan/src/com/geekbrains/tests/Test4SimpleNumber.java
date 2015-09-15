package com.geekbrains.tests;

import java.util.ArrayList;

/**
 * @Author Max
 * @Date 15.09.2015
 * @Version JDK 1.8
 * @Purpose Education
 */
public class Test4SimpleNumber {
    public static void main(String[] args) {
        //количество чисел
        ArrayList<Integer> primes = new ArrayList<>();
        int n = 50;

        //проверяем данный массив на количество простых чисел
        for (int i = 2; i < n; i++) {
            Boolean isPrime = true;
            for (int aList : primes) {
                if (i % aList == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primes.add(i);
            }
        }
        System.out.print(primes);
    }
}

