package TaskMovable;

import com.sun.javaws.exceptions.InvalidArgumentException;

public class MovableRectangle implements Movable {
    private MovablePoint bottomLeft;
    private MovablePoint topRight;

    private boolean sameSpeed(int xSpeed, int ySpeed) {
        return xSpeed == ySpeed;
    }

    MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) throws IllegalArgumentException{
        if (!sameSpeed(xSpeed, ySpeed)) {
            throw new IllegalArgumentException("Different speed");
        } else {
            bottomLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
            topRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
        }

    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "bottomRight=" + bottomLeft +
                ", topLeft=" + topRight +
                '}';
    }

    @Override
    public void moveUp() {
        bottomLeft.moveUp();
        topRight.moveUp();
    }

    @Override
    public void moveDown() {
        bottomLeft .moveDown();
        topRight   .moveDown();
    }

    @Override
    public void moveLeft() {
        bottomLeft .moveLeft();
        topRight   .moveLeft();
    }

    @Override
    public void moveRight() {
        bottomLeft .moveRight();
        topRight   .moveRight();
    }
}
