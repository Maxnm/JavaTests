package ua.kiev.prog.Lesson3;

import java.util.Scanner;

public class Lesson3a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 0;

        //Ѕесконечный цикл запускает посто€нное использование данного вызова
        for (; ; ) {
            try {
                System.out.println("Input number");
                a = sc.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Wrong input");
                sc.nextLine();
            }
            System.out.println(a);
        }
    }
}
