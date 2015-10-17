package ua.kiev.prog.Lesson5;

import java.io.*;

public class File2Write {

    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out, true);

        File file1 = new File ("a.txt");
        try {
            file1.createNewFile(); //�������� ����� � ����� �� ��������� (����� �������)
        } catch (Exception e){
            System.out.println("Error");
        }

        File folder = new File("A");
        folder.mkdir(); //�������� �����, �������� ������� ����

        file1.renameTo(new File("b.txt")); //������������� �� ������ ��������

        File file2 = new File("b.txt");
        file2.delete(); //�������� �����
        folder.delete(); //�������� �����

        //����������� ������ �����
        File f1 = new File(".");
        if(f1.isDirectory()){
            String[] filenames = f1.list();
            for (String names: filenames){
                pw.println(names);
            }
        }

    }

}
