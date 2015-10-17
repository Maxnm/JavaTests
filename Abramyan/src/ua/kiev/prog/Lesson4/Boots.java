package ua.kiev.prog.Lesson4;

/**
 * Есть класс Dog, собака может укусить стол, тапок, колбаса, себя. После укуса - написать мнение о укушенном предмете.
 */

public class Boots implements Bite {
    private int size;
    private String brand;
    private String color;

    public Boots(int size, String brand, String color) {
        this.size = size;
        this.brand = brand;
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean eatable() {
        return false;
    }

    @Override
    public String description() {
        return this.toString();
    }

    @Override
    public String toString() {
        return "Boots [" + "size=" + size + ", brand='" + brand + '\'' + ", color='" + color + '\'' + ']';
    }
}
