package ua.kiev.prog.Lesson5;

import java.io.*;

public class File2Write {

    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out, true);

        File file1 = new File ("a.txt");
        try {
            file1.createNewFile(); //Создание файла в папке по умолчанию (папка проекта)
        } catch (Exception e){
            System.out.println("Error");
        }

        File folder = new File("A");
        folder.mkdir(); //Создание папки, название указано выше

        file1.renameTo(new File("b.txt")); //Переименовать на другое название

        File file2 = new File("b.txt");
        file2.delete(); //удаление файла
        folder.delete(); //удаление папки

        //отображение списка папок
        File f1 = new File(".");
        if(f1.isDirectory()){
            String[] filenames = f1.list();
            for (String names: filenames){
                pw.println(names);
            }
        }

    }

}
