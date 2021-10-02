package Shapes;

public class Rectangle extends Shape{
    private double width;
    private double length;

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * width + 2 * length;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.length = height;
    }

    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
