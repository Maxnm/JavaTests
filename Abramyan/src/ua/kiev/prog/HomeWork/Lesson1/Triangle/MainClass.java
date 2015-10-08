package ua.kiev.prog.HomeWork.Lesson1.Triangle;

public class MainClass {
    public static void main(String[] args) {
        Triangle tr1 = new Triangle(3, 5, 1);
        Triangle tr2 = new Triangle(2, 6, 2);
        Triangle tr3 = new Triangle(5, 4, 4);

        tr1.paramArea();
        tr2.paramArea();
        tr3.paramArea();
    }
}
