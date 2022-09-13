public class ElonsToyCar {
    public int batteryPercent = 100;
    public int driven = 0;
    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return String.format("Driven %d meters",driven);
    }

    public String batteryDisplay() {
        if(batteryPercent > 0){
            return "Battery at " + batteryPercent + "%";
        }
        return "Battery empty";
    }

    public void drive() {
        if(batteryPercent > 0){
            batteryPercent -= 1;
            driven += 20;            
        }
    }
}
