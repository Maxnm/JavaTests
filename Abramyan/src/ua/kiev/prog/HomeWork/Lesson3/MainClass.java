package ua.kiev.prog.HomeWork.Lesson3;

public class MainClass {
    public static void main(String[] args) throws GroupException {
        Student student1 = new Student("Student 1", "BEK-01");

        Group gr = new Group("BEK-01");

        try {
            for (int i = 0; i < 20; i++) {
                gr.addStudent(student1);
            }
        } catch (GroupException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(gr);
    }

}
