package ss.week2.camera;

import java.util.Arrays;

public class SpeedCamera {
    public static final int INITIAL_CAPACITY = 4;
    private final int limit;

    // I would use ArrayList, but that doesn't work for primitive types.
    // Rather, I'll hardcode it to the maximum number
    private int[] speeds = new int[25];
    private int index = 0; // pointer to end of list for adding/deleting

    // CONSTRUCTORS
    public SpeedCamera(int limit) {
        this.limit = limit;
    }
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
//        int count = 0;
//        while (count < speeds.length && speeds[count] != 0) {
//            count++;
//        }
//        return count;

        return index;
    };

    /**
     * @param index, of captured speeds
     * @return the measured speed of car
     * **/
    public int getSpeed(int index) {
        return speeds[index];
    };

    public int calculateFine(int speed, int limit) {
        if (speed > limit && speed <= limit + 10) {
            return 50;
        } else if (speed > limit + 10 && speed <= limit + 20) {
            return 100;
        } else if (speed > limit + 20) {
            return 200;
        }

        return 0;
    }

    /**
     * @param speed, records speed of passing car as newest measurement
     * **/
    public void record(int speed) {
        speeds[index] = speed;
        index++;
        if (index >= speeds.length - 1) {
            speeds = Arrays.copyOf( speeds, 2*speeds.length );
        }
        // record works
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
            int finalIndex = getCount() - 1;
            int firstIndex = finalIndex - k + 1;

            for (var i = finalIndex; (i > firstIndex - 1) && (i > -1); i--) {
//                System.out.println(speeds[i]);
                totalSpd += speeds[i];
//                System.out.println("totalSpd: " + totalSpd);
            }
        }

        if(k > 0 && getCount() > 0) {
            if(k <= getCount()) {
//                System.out.println("condition met!");
                totalSpd /= k;
//                System.out.println("averageSpd is then: " + totalSpd);
            } else {
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
            fine += calculateFine(speed, limit);
        }

        return fine;
    };

    /**
     * Removes the oldest measurement, all measurements shift one forward(to the "left").
     * Works with at least one element.
     * **/
    public void removeOldest() {
        if (getCount() >= 1) {
            // rather than first emptying first item, just shift (override) all remaining items to the left
            for (var i = 0; i < getCount() - 1; i++) {
                speeds[i] = speeds[i + 1];
            }
        }

        index--; // shift our pointer one back!
    };

    /**
     * @return a description of this camera.
     * TBC in later exercise.
     * **/
//    public String toString() {};

}
