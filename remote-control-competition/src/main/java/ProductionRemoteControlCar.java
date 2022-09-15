class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar>{
    private final int speed = 10;
    private int distance;
    private int victories;

    @Override
    public void drive() {
        this.distance += this.speed;
    }

    @Override
    public int getDistanceTravelled() {
        return this.distance;
    }

    public int getNumberOfVictories() {
        return this.victories;
    }

    public void setNumberOfVictories(int numberofVictories) {
        this.victories += numberofVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar car){
        return this.victories - car.victories;
    }
}
