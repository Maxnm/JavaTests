package ua.kiev.prog.HomeWork.Lesson2;

public class Board {
    private Shape[] shapeArr = new Shape[4];

    public void addShape(Shape fig, int place) {
        place -= 1;

        if (place < 0 || place >= shapeArr.length || shapeArr[place] != null) {
            System.out.println("Out of bounds");
            return;
        }
        shapeArr[place] = fig;
    }

    public void delShape(int place) {
        if (shapeArr[place] == null) {
            System.out.println("Already empty");
            return;
        } else if (place < 0 || place >= shapeArr.length || shapeArr[place] != null) {
            System.out.println("Out of bounds");
            return;
        }
        shapeArr[place] = null;
    }

    @Override
    public String toString() {
        double totalArea = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < shapeArr.length; i++) {
            if (shapeArr[i] != null) {
                sb.append(i + 1);
                sb.append(") ");
                sb.append(shapeArr[i]);
                sb.append("\n");
                totalArea += shapeArr[i].area();
            } else {
                sb.append(i + 1);
                sb.append(") ");
                sb.append("- is empty -");
                sb.append("\n");
            }
        }
        sb.append("--------");
        sb.append("Total area is ").append(totalArea);
        return sb.toString();
    }
}

