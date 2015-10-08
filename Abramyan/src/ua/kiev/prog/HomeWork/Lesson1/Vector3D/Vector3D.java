package ua.kiev.prog.HomeWork.Lesson1.Vector3D;

/**
 * ������� ����� �Vector3d� (�.�. �� ������ ��������� ������ � 3-� ������, ���������� ������� ���������).
 * � �������� ������� ����� ������ �������� ���������� �������.
 * ��� ����� ������ ����������� ������ ��������, ���������� � ���������� ������������ ��������.
 * �������� ��������� �������� ����� ������ � ������������� ��.
 */

public class Vector3D {
    private int x;
    private int y;
    private int z;

    public Vector3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    //�������� ��������
    void Sum(Vector3D v) {
        int newX = this.x + v.x;
        int newY = this.y + v.y;
        int newZ = this.z + v.z;
        System.out.println("Sum of vectors is (" + newX + ", " + newY + ", " + newZ + ")\n");
    }

    //��������� ������������
    void Scalar(Vector3D v) {
        int scalar = this.x * v.x + this.y * v.y + this.z * v.z;
        System.out.println("Scalar multiply is " + scalar + "\n");
    }

    //��������� ������������
    void Vector(Vector3D v) {
        int newX = this.y * v.z - this.z * v.y;
        int newY = -(this.x * v.z - this.z * v.x);
        int newZ = this.x * v.y - this.y * v.x;
        System.out.println("Vector multiply is (" + newX + ", " + newY + ", " + newZ + ")\n");
    }
}
