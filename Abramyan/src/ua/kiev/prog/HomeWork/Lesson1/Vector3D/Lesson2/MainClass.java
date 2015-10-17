package ua.kiev.prog.HomeWork.Lesson1.Vector3D.Lesson2;

public class MainClass {
    public static void main(String[] args) {
        Board newBoard = new Board();

        //Точки для треугольника
        Point p1 = new Point(0, 1);
        Point p2 = new Point(4, 0);
        Point p3 = new Point(0, 5);
        Triangle tr = new Triangle(p1, p2, p3);

        //Точки для квадрата
        Point p4 = new Point(3, 1);
        Point p5 = new Point(3, 5);
        Point p6 = new Point(7, 1);
        Point p7 = new Point(7, 5);
        Square sq = new Square(p4, p5, p6, p7);

        //Точки для прямоугольника
        Point p8 = new Point(3, 1);
        Point p9 = new Point(3, 5);
        Point p10 = new Point(7, 1);
        Point p11 = new Point(7, 5);
        Rectangle rc = new Rectangle(p8, p9, p10, p11);

        //Точки для трапеции
        Point p12 = new Point(0, 1);
        Point p13 = new Point(3, 3);
        Point p14 = new Point(4, 3);
        Point p15 = new Point(6, 1);
        Trapeze tz = new Trapeze(p12, p13, p14, p15);

        //Расположение фигур на доске
        newBoard.addShape(tr, 2);
        newBoard.addShape(sq, 4);
        newBoard.addShape(rc, 1);
        newBoard.addShape(tz, 3);

        System.out.println(newBoard.toString());
    }
}
