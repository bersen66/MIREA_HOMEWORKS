package lab11;

public class HorseRunner extends Thread{
    Thread t;
    HorseInfo h;
    boolean isFinished = false;
    int timer = 0;
    double distance;
    ResultBuilder results;

    HorseRunner(HorseInfo hinf, double distance, ResultBuilder rb) {
        h = hinf;
        this.distance = distance;

        results = rb;

    }

    @Override
    public void run() {
        while (!isFinished) {
            h.move();
            timer++;
            if (h.getDistanceTravelled() >= distance) {
                //System.out.println(h.name + " finished!");
                isFinished = true;
                results.AddEntry(this);
            }
        }
    }

    public String getHorseName() {
        return h.name;
    }


    @Override
    public String toString() {
        return "HorseRunner{" +
                "h=" + h +
                ", isFinished=" + isFinished +
                ", distance=" + distance +
                '}';
    }
}
