package Shapes;

public class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }


    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    public double getSide() {
        return super.getWidth();
    }

    @Override
    public String toString() {
        return "Square{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
