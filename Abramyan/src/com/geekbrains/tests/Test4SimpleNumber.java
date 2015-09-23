package com.geekbrains.tests;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Author Max
 * @Date 15.09.2015
 * @Version JDK 1.8
 * @Purpose Education
 *
 * Description: To find all simple numbers in given area
 */
public class Test4SimpleNumber {
    public static void main(String[] args) {

        //Searching area
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number for search area:");
        int n = in.nextInt();

        ArrayList<Integer> primes = new ArrayList<>();

        //Analysing following array on existence of simple numbers
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

        //Displaying an array with simple numbers
        System.out.print(primes);
    }
}

