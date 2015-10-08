package ua.kiev.prog.HomeWork.Lesson2;


public class Rectangle extends Shape {
    private Point a;
    private Point b;
    private Point c;
    private Point d;

    public Rectangle(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public double area() {
        return a.distance(b) + b.distance(c) + c.distance(d) + d.distance(a);
    }

    @Override
    public double size() {
        return a.distance(b) * b.distance(c);
    }

    @Override
    public String toString() {
        return "Rectangle area: " + area() + ",\n perimetr: " + size();
    }
}
