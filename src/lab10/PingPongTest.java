package lab10;

import lab10.PingPong.PingPong;

public class PingPongTest {
    public static void main(String[] args) {
        PingPong pp = new PingPong();
        Caller c1 = new Caller(pp, "th1");
        Caller c2 = new Caller(pp, "th2");

        while (true) {
            c1.run();
            c2.run();

        }

    }
}
