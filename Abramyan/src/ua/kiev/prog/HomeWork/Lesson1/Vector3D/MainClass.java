package ua.kiev.prog.HomeWork.Lesson1.Vector3D;

public class MainClass {
    public static void main(String[] args) {
        Vector3D vr1 = new Vector3D(2, 5, 1);
        Vector3D vr2 = new Vector3D(4, 7, 1);

        vr1.Sum(vr2);
        vr1.Scalar(vr2);
        vr1.Vector(vr2);
    }
}
