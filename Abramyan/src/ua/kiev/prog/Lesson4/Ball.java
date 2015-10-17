package ua.kiev.prog.Lesson4;

public class Ball implements Bite {
    double size;
    String color;

    public Ball(double size, String color) {
        this.size = size;
        this.color = color;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
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
    public String toString() {
        return "Ball[" + "size=" + size + ", color='" + color + '\'' + ']';
    }

    @Override
    public String description() {
        return this.toString();
    }
}
