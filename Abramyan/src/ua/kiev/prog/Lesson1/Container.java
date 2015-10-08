package ua.kiev.prog.Lesson1;

public class Container {

    private Box[] cont = new Box[9];
    private double price = 5;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void addBox(Box aBox, int place) {
        place -= 1;
        if (place < 0 || place > cont.length) {
            System.out.println("Out of bounds");
            return;
        }
        if (cont[place] != null) {
            System.out.println("Place is occupated");
        }
        cont[place] = aBox;
    }

    @Override
    public String toString() {
        double totalPrice = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cont.length; i++) {
            if (cont[i] != null) {
                sb.append(i + 1);
                sb.append(") ");
                sb.append(cont[i]);
                sb.append("\n");
                totalPrice = cont[i].getWeight() * this.price;
            } else {
                sb.append(i + 1);
                sb.append(") ");
                sb.append("- is empty -");
                sb.append("\n");
            }
        }
        sb.append("--------");
        sb.append("Total price is ").append(totalPrice);
        return sb.toString();
    }
}


