package ua.kiev.prog.Lesson1;


public class Box {

    int width;
    int height;
    int length;
    int weight;

    public Box(int width, int height, int length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    int area() {
        return width * length * height;
    }

//    int rent() {
//        int rent = weight * 5;
//        return rent;
//    }

    @Override
    public String toString() {
        return "Box: \n" +
                " - width: " + width +
                "\n - length: " + length +
                "\n - height: " + height;
    }
}
