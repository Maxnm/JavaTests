package ua.kiev.prog.Lesson4;

/**
 * �������� ����� �������, ��������� �� ������ �����-���. ��������� - ����, �� ��� ���������� � ����.
 * ������� ������ ����� ������� � �������� �� �������. (� ������� ���� �������� - �����).
 * ���� ������ �� ������ ������� � ����, �� ���������� ������� ������ ������� ������ ("�����").
 * ���� ���� - �� ������� ��������� "������ ���������"
 */
public class MainClass {
    public static void main(String[] args) {
        Ball ball = new Ball (2.3, "White");
        Boots boots = new Boots(42, "G&C", "brown");
        Salami salami = new Salami(12.3, 0.3, "Saltavsky MK");

        Dog dog = new Dog("Barky", 3, "Black");

        dog.Bite(ball);
        dog.Bite(boots);
        dog.Bite(salami);
        dog.Bite(dog);
    }
}
