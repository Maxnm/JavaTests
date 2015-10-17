package ua.kiev.prog.Lesson5;

import java.io.*;

public class DataOutputStreamTest {
    public static void main(String[] args) {
        try (DataOutputStream f = new DataOutputStream(new FileOutputStream("b.txt"))) {
            f.writeInt(5);
        } catch (IOException e) {
            System.out.println("File write error");
        }
    }
}