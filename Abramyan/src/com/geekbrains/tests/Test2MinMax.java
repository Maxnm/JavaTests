package com.geekbrains.tests;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author Max
 * @Date 15.09.2015
 * @Version JDK 1.8
 * @Purpose Education
 */
public class Test2MinMax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //��������� ������ ��������� ������;
        double a = Math.random() * 20;
        int b = (int) a;
        int[] list = new int[b];

        //����������� ������
        for (int i = 0; i < list.length; i++) {
            double c = Math.random() * 10;
            int f = (int) c * i;
            list[i] = i + f;
        }

        //��������� �������� ��� ��������� � ����� �������
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int aList : list) {
            //������� � ����� ����� ����� �������
            sum = sum + aList;

            //��������� ��������
            if (aList > max) {
                max = aList;
            }
        }

        //������� �������
        int average = sum / list.length;

        System.out.println(Arrays.toString(list));
        System.out.println("Maximum is " + max);
        System.out.println("Average is " + average);
    }
}
