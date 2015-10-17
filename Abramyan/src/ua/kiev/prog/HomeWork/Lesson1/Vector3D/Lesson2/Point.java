package ua.kiev.prog.HomeWork.Lesson1.Vector3D.Lesson2;


public class Point {
    double x;
    double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(Point b) {
        double x = this.x - b.x;
        double y = this.y - b.y;
        return Math.sqrt(x * x + y * y);
    }
}
