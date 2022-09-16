
class Darts {
    
    private double distance = 0; 
    Darts(double x, double y) {
        this.distance = Math.sqrt(Math.pow(x,2)+Math.pow(y, 2));
    }

    int score() {
        if(this.distance <= 1){
            return 10;
        }else if(this.distance <= 5){
            return 5;
        }else if(this.distance <= 10){
            return 1;
        }
        return 0;
    }

}