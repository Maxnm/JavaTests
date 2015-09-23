package com.geekbrains.tests;

import java.util.Arrays;
import java.util.TreeMap;

/**
 * @Author Max
 * @Date 15.09.2015
 * @Version JDK 1.8
 * @Purpose Education
 * <p>
 * Description: With the help of TreeMap calculate how many times elements of an array are being repeated
 */
public class Test3Treemap {
    public static void main(String[] args) {

        //Creating default array
        int arr[] = {3, 4, 1, 5, 7, 3, 1, 4, 6, 8, 2};

        TreeMap<Integer, Integer> tm = new TreeMap<>();

        //Elements of the array are put into TreeMap array with calculation of repeats
        for (int aArr : arr) {
            int cnt = 1;
            if (tm.containsKey(aArr)) {
                cnt = tm.get(aArr);
                cnt++;
            }
            tm.put(aArr, cnt);
        }

        //Rearranging base array after TreeMap sorting
        int j = 0;
        for (int k : tm.keySet()) {
            for (int i = 0; i < tm.get(k); i++) {
                arr[j] = k;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}





