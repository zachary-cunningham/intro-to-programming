package bikes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ss.week2.bikes.Bike;
import ss.week2.bikes.Rider;
import ss.week2.bikes.Station;

import static org.junit.jupiter.api.Assertions.*;

/**
 * renting from an empty station; renting, which links
 * rider and bike and empties a dock; and returning a bike to a full station
 *
 * assertFalse
 * assertTrue
 * assertNull
 * assertSame
 * **/
public class StationTest {
    /** A rider. */
    private Rider ann;
    /** Another rider. */
    private Rider bob;
    /** A station. */
    private Station station;

    /** Bikes. **/
    private Bike bike;
    private Bike bike2;

    @BeforeEach
    public void setUp() {
        ann = new Rider("Ann");
        bob = new Rider("Bob");

        bike = new Bike(67);
        bike2 = new Bike(69);

        station = new Station("RentABike",10);
    }

    @Test
    // should return null by renting from an empty station
    public void rentFromEmpty() {
        assertNull(station.rentBike(ann));
    }

    @Test
    // should return null by renting from an empty station
    public void rentBike() {
        assertEquals(0, station.countBikes());
        // give the station one bike
        station.park(bike);
        assertEquals(1, station.countBikes());

        // give ann that bike
        station.rentBike(ann);
        assertEquals(0, station.countBikes());

        // check that ann has that bike
        assertSame(ann.getBike(), bike);
    }

    @Test
    // should return null by renting from an empty station
    public void returnBike() {
        // give station a bike
        station.park(bike);

        // rent it to ann
        station.rentBike(ann);

        // ann gives the bike back
        station.returnBike(ann);

        // check that the station holds it now
        assertEquals(1, station.countBikes());
        assertNull(ann.getBike());
        assertNull(bike.getRider());
    }
}
