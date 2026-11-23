package ss.week2.camera;

public class SpeedCamera {
    public static final int INITIAL_CAPACITY = 4;
    private final int limit;

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
    public int getLimit() {};

    /**
     * @return the number of measurements
     * **/
    public int getCount() {};

    /**
     * @param index, of captured speeds
     * @return the measured speed of car
     * **/
    public int getSpeed(int index) {};

    /**
     * @param speed, records speed of passing car as newest measurement
     * **/
    public void record(int speed) {};

    /**
     * @return the highest measured speed
     * **/
    public int fastest() {};

    /**
     * @param k - the number of measurements to average
     * @return the average speed of the latest k measurements
     * **/
    public double averageLast(int k) {};

    /**
     * @return the number of speeding cars
     * **/
    public int countSpeeding () {};

    /**
     * @return the total number of fines
     * **/
    public int totalFines () {};

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
