package lab11;

public class HorseInfo {
    String name;
    double speed;
    double distanceTravelled = 0;
    double acceleration = 0;

    public HorseInfo(String name, double startSpeed, double acceleration) {
        this.name = name;
        this.speed = startSpeed;
        this.acceleration = acceleration;
    }

    public void move() {
        distanceTravelled += speed;
        speed += acceleration;
    }

    public double getDistanceTravelled() {
        return distanceTravelled;
    }

    @Override
    public String toString() {
        return "HorseInfo{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", distanceTravelled=" + distanceTravelled +
                ", acceleration=" + acceleration +
                '}';
    }
}
