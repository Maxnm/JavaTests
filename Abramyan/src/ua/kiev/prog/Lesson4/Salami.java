package ua.kiev.prog.Lesson4;

public class Salami implements Bite {
    private double price;
    private double weight;
    private String brand;

    public Salami(double price, double weight, String brand) {
        this.price = price;
        this.weight = weight;
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Salami[" + "price=" + price + ", weight=" + weight + ", brand='" + brand + '\'' + ']';
    }

    @Override
    public boolean eatable() {
        return true;
    }

    @Override
    public String description() {
        return this.toString();
    }
}
