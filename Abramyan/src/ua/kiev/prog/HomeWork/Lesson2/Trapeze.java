package ua.kiev.prog.HomeWork.Lesson2;

public class Trapeze extends Shape {
    private Point a;
    private Point b;
    private Point c;
    private Point d;

    public Trapeze(Point a, Point b, Point c, Point d) {
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
        double ab = a.distance(b);
        double bc = b.distance(c);
        double cd = c.distance(d);
        double ad = d.distance(a);
        double p = ab + bc + cd + ad;
        //Площадь трапеции по формуле Герона
        return (ad + bc) / 4 * Math.abs(ad - bc) * Math.sqrt((p - ad) * (p - bc) * (p - ab) * (p - cd));
    }

    @Override
    public String toString() {
        return "Trapeze area: " + area() + ",\n perimetr: " + size();
    }
}

