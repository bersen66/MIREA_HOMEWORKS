package Ball;

public class BallTest {
    public static void main(String[] args) {
        Ball b1 = new Ball();
        Ball b2 = new Ball(23, "Red");
        System.out.println("Ball volume equals " + b1.volume());
        System.out.println("Ball volume equals " + b2.volume());
    }
}
