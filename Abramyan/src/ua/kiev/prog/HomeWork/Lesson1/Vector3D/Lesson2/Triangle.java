package ua.kiev.prog.HomeWork.Lesson1.Vector3D.Lesson2;

public class Triangle extends Shape {

    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }

    @Override
    public double area() {
        return a.distance(b) + b.distance(c) + c.distance(a);
    }

    @Override
    public double size() {
        double p = area() / 2.0;
        double ab = a.distance(b);
        double bc = b.distance(c);
        double ac = c.distance(a);
        return Math.sqrt(p * (p - ab) * (p - bc) * (p - ac));
    }

    @Override
    public String toString() {
        return "Triangular area: " + area() + ",\n perimetr: " + size();
    }
}
