package ss.week2.camera;

public class SpeedCamera {
    public static final int INITIAL_CAPACITY = 4;
    private final int limit;

    // I would use ArrayList, but that doesn't work for primitive types.
    // Rather, I'll hardcode it to the maximum number
    private int[] speeds = new int[25];
    private int index = 0; // pointer to end of list for adding/deleting

    // custom constructor
    public SpeedCamera(int limit) {
        this.limit = limit;
    }

    // override, default values
    public SpeedCamera() {
        this(80);
    }

    /**
     * @return the speed limit
     * **/
    public int getLimit() {
        return this.limit;
    };

    /**
     * @return the number of measurements
     * **/
    public int getCount() {
        int count = 0;
        while (count < speeds.length && speeds[count] != 0) {
            count++;
        }
        return count;
    };

    /**
     * @param index, of captured speeds
     * @return the measured speed of car
     * **/
    public int getSpeed(int index) {
        return speeds[index];
    };

    /**
     * @param speed, records speed of passing car as newest measurement
     * **/
    public void record(int speed) {
        speeds[index] = speed;
        index++;
    };

    /**
     * @return the highest measured speed
     * **/
    public int fastest() {
        int highscore = 0;
        for(int speed : speeds) {
            if (speed > highscore) {
                highscore = speed;
            }
        }

        return highscore;
    };

    /**
     * @param k - the number of measurements to average
     * @return the average speed of the latest k measurements
     * **/
    public double averageLast(int k) {
        double totalSpd = 0;

        if (getCount() > 0) {
            int finalIndex = speeds.length - 1;
            int firstIndex = finalIndex - k;

            for (var i = finalIndex; (i > firstIndex) && i > -1; i--) {
                totalSpd += speeds[i];
            }
        }

        if(k > 0) {
            if(k <= getCount()) {
                totalSpd /= k;
            } else if (getCount() > 0){
                totalSpd /= getCount();
            }
        }

        // is now averageSpd
        return totalSpd;
    };

    /**
     * @return the number of speeding cars
     * **/
    public int countSpeeding () {
        int count = 0;
        for(int speed : speeds) {
            if (speed > this.limit) {
                count++;
            }
        }

        return count;
    };

    /**
     * @return the total number of fines
     * **/
    public int totalFines () {
        int fine = 0;

        // per car, add to the fine
        for (int speed: speeds){

            if (speed <= limit) {
                // nothing :)
            } else if (speed > limit && speed <= limit + 10) {
                fine += 50;
            } else if (speed > limit + 10 && speed <= limit + 20) {
                fine += 100;
            } else if (speed > limit + 20) {
                fine += 200;
            }

        }

        return fine;
    };

    /**
     * Removes the oldest measurement, all measurements shift one forward.
     * Must only be called if there is at least one measurement.
     * **/
    public void removeOldest() {};

    /**
     * @return a description of this camera.
     * TBC in later exercise.
     * **/
//    public String toString() {};

}
