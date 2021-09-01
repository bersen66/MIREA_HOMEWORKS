package Ball;



public class Ball {
    private double radius = 0.0;
    private String color;

    public Ball() {
        radius = 0.0;
        color = "Blue";
    }

    public Ball(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Ball(String color) {
        this.color = color;
    }

    public Ball(double radius) {
        this.radius = radius;
    }


    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    double volume () {
        return 4 * Math.PI * Math.pow(radius, 3) / 3;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
