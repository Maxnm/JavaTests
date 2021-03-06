package ua.kiev.prog.HomeWork.Lesson1.Vector3D.Lesson2;

public class Square extends Shape {
    private Point a;
    private Point b;
    private Point c;
    private Point d;

    public Square(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
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

    public Point getD() {
        return d;
    }

    public void setD(Point d) {
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
        return "Square area: " + area() + ",\n perimetr: " + size();
    }
}
