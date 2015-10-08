package ua.kiev.prog.HomeWork.Lesson1.Cat;

/**
 * Описать класс «Cat» (в качестве образца можно взять домашнего питомца).
 * Наделить его свойствами и методами. Создать несколько  экземпляров объектов этого класса.
 * Использовать эти объекты.
 */

public class Cat {

    private int age;
    private String color;
    private String breed;
    private String name;

    public Cat(int age, String color, String breed, String name) {
        this.age = age;
        this.color = color;
        this.breed = breed;
        this.name = name;
    }

    public Cat() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void marchMode() {
        System.out.println(this.getName() + " is crying meow-meow, meow-meow, meow-meow, meow-meow" + "\n");
    }

    void feedMe() {
        System.out.println(this.getName() + ": Need to eat" + "\n");
    }

    int ageing(int n) {
        age += n;
        return age;
    }

    void description() {
        System.out.println("Cat " + name + " is " + age + ".\nColor: " + color + ".\nIt's a " + breed + "\n");
    }
}
