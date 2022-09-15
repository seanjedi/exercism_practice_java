class NeedForSpeed {
    private int speed;
    private int batteryDrain;
    private int batterPercent = 100;
    private int distance = 0;

    public NeedForSpeed(int speed, int batteryDrain){
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return this.batterPercent <= 0;
    }

    public int distanceDriven() {
        return this.distance;
    }

    public void drive() {
        if(!this.batteryDrained()){
            this.distance += this.speed;
            this.batterPercent -= this.batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}


class RaceTrack {
    private int distance;
    public RaceTrack(int distance){
        this.distance = distance;
    }

    public boolean tryFinishTrack(NeedForSpeed car) {
        while(car.distanceDriven() < this.distance && !car.batteryDrained()){
            car.drive();
        }
        if(car.distanceDriven() >= this.distance){
            return true;
        }
        return false;
    }
}
