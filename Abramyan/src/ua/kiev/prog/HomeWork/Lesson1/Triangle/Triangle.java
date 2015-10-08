package ua.kiev.prog.HomeWork.Lesson1.Triangle;

/**
 * ������� ����� �Triangle�. � �������� ������� �������� ������ ������ ������������.
 * ���������� ����� ������� ����� ���������� ������� ����� ������������.
 * �������� ��������� �������� ����� ������ � ������������� ��.
 */

public class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle() {
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    //������� ������� ������������
    void paramArea() {
        double p = a + b + c;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.printf("Area is: %.2f;\n", area);
    }
}
