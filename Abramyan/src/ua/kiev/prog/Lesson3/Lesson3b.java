package ua.kiev.prog.Lesson3;

import java.util.Random;

/**
 * ��������� ����� ��������� �������, ��������� ���� �������� for
 */
public class Lesson3b {

    //TODO ��������������;
    public static void main(String[] args) {

        Random rn = new Random();

        int[] a = new int[5 + rn.nextInt(11)];
        int[] b = new int[5 + rn.nextInt(11)];
        int[] c = new int[5 + rn.nextInt(11)];

        fillArray(a);
        fillArray(b);
        fillArray(c);

        int sum = 0;

        for (int i = 0, stop = 0; stop < 3; i++) {
            stop = 0;
            try {
                sum += a[i];
            } catch (ArrayIndexOutOfBoundsException e) {
                stop += 1;
            }

            try {
                sum += b[i];
            } catch (ArrayIndexOutOfBoundsException e) {
                stop += 1;
            }

            try {
                sum += b[i];
            } catch (ArrayIndexOutOfBoundsException e) {
                stop += 1;
            }

        }


    }


    static void fillArray(int[] a) {
        Random rn = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = rn.nextInt(10);
        }
    }
}



