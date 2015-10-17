package ua.kiev.prog.Lesson4;

public class Dog implements Bite {
    private String name;
    private int age;
    private String color;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return "Dog [" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ']';
    }

    @Override
    public boolean eatable() {
        return true;
    }

    @Override
    public String description() {
        return this.toString();
    }

    public void Bite(Bite b) {
        System.out.println("I've bitten " + b.description());
        String temp = (b.eatable()) ? ":)" : ":(";
        System.out.println(temp);
    }
}
