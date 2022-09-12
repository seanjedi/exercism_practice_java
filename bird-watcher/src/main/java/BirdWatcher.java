
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        int[] birdsPerWeek = new int[7];;
        int len = birdsPerDay.length;
        for (int i = 6; i >= 0 ; i--) {
            if(len-i > 0){
                birdsPerWeek[i] = birdsPerDay[i];
            }
        }
        return birdsPerWeek;
    }

    public int getToday() {
        return this.getLastWeek()[6];
    }

    public void incrementTodaysCount() {
        this.birdsPerDay[birdsPerDay.length-1] += 1;
    }

    public boolean hasDayWithoutBirds() {
        boolean flag = false;
        for(int i: this.birdsPerDay){
            if(i == 0){
                flag = true;
            }
        }
        return flag; 
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sum = 0;
        for(int i = 0; i < numberOfDays; i++){
            if(i < this.birdsPerDay.length){
                sum += this.birdsPerDay[i];
            }
        }
        return sum;
    }

    public int getBusyDays() {
        int busyDays = 0;
        for(int i : this.birdsPerDay){
            if(i>=5){
                busyDays += 1;
            }
        }
        return busyDays;
    }
}
