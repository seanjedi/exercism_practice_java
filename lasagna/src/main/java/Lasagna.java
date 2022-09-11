public class Lasagna {
    public int expectedMinutesInOven(){
        return 40;
    }

    public int remainingMinutesInOven(int x){
        return 40 - x;
    }

    public int preparationTimeInMinutes(int x){
        return x*2;
    }

    public int totalTimeInMinutes(int x, int y){
        return (x*2 + y);
    }
}
