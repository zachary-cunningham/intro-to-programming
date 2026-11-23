package ss.week2.camera;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tests SpeedCamera.
 */
public class SpeedCameraTest {
    /** The speeds from week 1's speeding fines exercise. */
    private static final int[] WEEK1 = {
        78, 85, 93, 102, 81, 77, 110, 120, 99, 83, 75, 88,
        97, 115, 100, 79, 80, 90, 104, 112, 70, 82, 86, 130, 84
    };

    /** A camera with limit 80 and no measurements. */
    private SpeedCamera camera;

    @BeforeEach
    public void setUp() {
        camera = new SpeedCamera();
    }

    /** Tests a new camera. */
    @Test
    public void testNew() {
        assertEquals(80, camera.getLimit());
        assertEquals(0, camera.getCount());
        assertEquals(50, new SpeedCamera(50).getLimit());
    }

    /** Tests that measurements are kept in order, oldest first. */
    @Test
    public void testRecord() {
        camera.record(85);
        camera.record(93);
        camera.record(78);
        assertEquals(3, camera.getCount());
        assertEquals(85, camera.getSpeed(0));
        assertEquals(93, camera.getSpeed(1));
        assertEquals(78, camera.getSpeed(2));
    }

    /** Tests more measurements than fit in the initial array. */
    @Test
    public void testGrowing() {
        for (int i = 0; i < 25; i++) {
            camera.record(60 + i);
        }
        assertEquals(25, camera.getCount());
        for (int i = 0; i < 25; i++) {
            assertEquals(60 + i, camera.getSpeed(i));
        }
    }

    /** Tests the statistics of a camera without measurements. */
    @Test
    public void testEmpty() {
        assertEquals(0, camera.fastest());
        assertEquals(0.0, camera.averageLast(5), 0.001);
        assertEquals(0.0, camera.averageLast(0), 0.001);
        assertEquals(0, camera.countSpeeding());
        assertEquals(0, camera.totalFines());
    }

    /** Tests the statistics for the speeds of week 1. */
    @Test
    public void testWeek1Speeds() {
        for (int i = 0; i < WEEK1.length; i++) {
            camera.record(WEEK1[i]);
        }
        assertEquals(130, camera.fastest());
        assertEquals(92.8, camera.averageLast(WEEK1.length), 0.001);
        assertEquals(19, camera.countSpeeding());
        assertEquals(2200, camera.totalFines());
    }

    /** Tests the average of the newest measurements. */
    @Test
    public void testAverageLast() {
        for (int i = 0; i < WEEK1.length; i++) {
            camera.record(WEEK1[i]);
        }
        assertEquals(100.0, camera.averageLast(3), 0.001); // 86, 130, 84
        assertEquals(84.0, camera.averageLast(1), 0.001);
        assertEquals(92.8, camera.averageLast(100), 0.001); // all of them
        assertEquals(0.0, camera.averageLast(0), 0.001);
    }

    /** Tests the fines for another limit, at the edges of the rules. */
    @Test
    public void testOtherLimit() {
        SpeedCamera town = new SpeedCamera(50);
        town.record(50); // not over the limit: no fine
        town.record(60); // 10 over: 50
        town.record(61); // 11 over: 100
        town.record(70); // 20 over: 100
        town.record(71); // 21 over: 200
        assertEquals(4, town.countSpeeding());
        assertEquals(450, town.totalFines());
    }
}
