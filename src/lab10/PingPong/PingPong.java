package lab10.PingPong;

public class PingPong {
    private State currentState = State.Ping;
    public synchronized void call() {
        if (currentState == State.Ping) {
            System.out.println("Ping");
            currentState = State.Pong;
        } else {
            currentState = State.Ping;
            System.out.println("Pong");
        }
    }
}
