package lab10;

import jdk.nashorn.internal.codegen.CompilerConstants;
import lab10.PingPong.PingPong;

public class Caller implements Runnable {
    String threadName;
    PingPong pingPong;
    Caller(PingPong pp, String name) {
        this.pingPong = pp;
        this.threadName = name;
    }

    @Override
    public void run() {
        System.out.println(threadName);
        pingPong.call();
    }
}
