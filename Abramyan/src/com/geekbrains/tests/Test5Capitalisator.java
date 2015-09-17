package com.geekbrains.tests;

import java.util.Scanner;

/**
 * @Author Max
 * @Date 15.09.2015
 * @Version JDK 1.8
 * @Purpose Education
 */
public class Test5Capitalisator {
    public static void main(String[] args) {

        //Ввод текста с консоли
        Scanner in = new Scanner(System.in);
        String test = in.nextLine();

        //Создание массива длинной вводимой фразы
        char[] list = test.toCharArray();

        //Уменьшаем все буквы до строчных
        for (int i = 0; i < list.length; i++) {
            list[i] = Character.toLowerCase(list[i]);
        }

        //Объявление первой буквы заглавной
        list[0] = Character.toUpperCase(list[0]);

        //Цикл для преобразования каждого слова с заглавной буквы
        for (int i = 1; i < list.length; i++) {
            if (list[i] == ' ') {
                list[i + 1] = Character.toUpperCase(list[i + 1]);
            }
        }
        System.out.println(list);
    }
}

