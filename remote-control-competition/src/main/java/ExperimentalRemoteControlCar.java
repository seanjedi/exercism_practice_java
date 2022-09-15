public class ExperimentalRemoteControlCar implements RemoteControlCar{
    private final int speed = 20;
    private int distance;

    @Override
    public void drive() {
        this.distance += this.speed;
    }

    @Override
    public int getDistanceTravelled() {
        return this.distance;
    }
}
