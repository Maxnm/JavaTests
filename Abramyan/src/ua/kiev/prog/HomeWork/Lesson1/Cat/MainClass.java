package ua.kiev.prog.HomeWork.Lesson1.Cat;

public class MainClass {
    public static void main(String[] args) {

        Cat cat1 = new Cat(1, "Grey", "Scottish", "Greedy");
        Cat cat2 = new Cat(4, "White", "Ordinary", "Princess");
        Cat cat3 = new Cat(3, "Red", "Sphinx", "Professor");

        Cat cat4 = new Cat();
        cat4.setName("Iggy");
        cat4.setAge(3);
        cat4.setBreed("British");
        cat4.setColor("Dark-blue");

        cat1.ageing(5);
        cat2.feedMe();
        cat4.marchMode();

        cat1.description();
        cat2.description();
        cat3.description();
        cat4.description();
    }
}
