package com.geekbrains.tests;

import java.util.Scanner;

/**
 * @Author Max
 * @Date 15.09.2015
 * @Version JDK 1.8
 * @Purpose Education
 *
 * Description: To rearrange a string to a normal view. Example: "HeLlO mY fRiEnDs" -> "Hello My Friends"
 */
public class Test5Capitalisator {
    public static void main(String[] args) {

        //Text enter
        Scanner in = new Scanner(System.in);
        String test = in.nextLine();

        //Casting entered string to char array
        char[] list = test.toCharArray();

        //All letters edited to lower case
        for (int i = 0; i < list.length; i++) {
            list[i] = Character.toLowerCase(list[i]);
        }

        //First letter is capital
        list[0] = Character.toUpperCase(list[0]);

        //Other first letters are capital too
        for (int i = 1; i < list.length; i++) {
            if (list[i] == ' ') {
                list[i + 1] = Character.toUpperCase(list[i + 1]);
            }
        }
        System.out.println(list);
    }
}

