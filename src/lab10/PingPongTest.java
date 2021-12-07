package lab10;

enum State {
    Ping,
    Pong,
}

class PingPong {
    State state = State.Ping;

    void call() {
        synchronized (PingPong.class) {
            if (state == State.Ping) {
                System.out.println("Ping");
                state = State.Pong;
            } else {
                System.out.println("Pong");
                state = State.Ping;
            }
        }
    }
}

class Caller implements Runnable {
    Thread t;
    String name;
    PingPong pp;

    public Caller(String name, PingPong pp) {
        this.name = name;
        this.pp = pp;
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(name);
            pp.call();
        }
    }
}

public class PingPongTest {
    public static void main(String[] args) {
        PingPong pp = new PingPong();
        Caller t1 = new Caller("T1", pp);
        Caller t2 = new Caller("T2", pp);
    }
}
