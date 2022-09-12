public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double maxCarsHr = speed * 221;
        if (speed <= 4) {
            return maxCarsHr;
        } else if (speed <= 8) {
            return (maxCarsHr * 0.9);
        } else if (speed == 9) {
            return (maxCarsHr * 0.8);
        }
        return (maxCarsHr * 0.77);
    }

    public int workingItemsPerMinute(int speed) {
        return (int) productionRatePerHour(speed) / 60;
    }
}
