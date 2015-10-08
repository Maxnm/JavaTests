package ua.kiev.prog.Lesson1;


public class Lesson1 {

    public static void main(String[] args) {

        Box b1 = new Box(5, 3, 4);
        Box b2 = new Box(2, 4, 7);
        Box b3 = new Box(6, 55, 1);

        b1.setWeight(32);
        b2.setWeight(10);
        b3.setWeight(100);

        Container con = new Container();

        con.addBox(b1, 2);
        con.addBox(b2, 3);
        con.addBox(b3, 6);

        System.out.println(con);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
