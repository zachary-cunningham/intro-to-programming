package ss.week2.bikes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Tests the link between riders and bikes.
 */
public class RiderTest {
    /** A rider. */
    private Rider ann;
    /** Another rider. */
    private Rider bob;
    /** A bike. */
    private Bike bike;

    @BeforeEach
    public void setUp() {
        ann = new Rider("Ann");
        bob = new Rider("Bob");
        bike = new Bike(7);
    }

    /** Tests that a new rider has no bike and a new bike no rider. */
    @Test
    public void testNew() {
        assertNull(ann.getBike());
        assertNull(bike.getRider());
    }

    /** Tests that renting links rider and bike, in both directions. */
    @Test
    public void testRent() {
        assertTrue(ann.rent(bike));
        assertSame(bike, ann.getBike());
        assertSame(ann, bike.getRider());
    }

    /** Tests that a rider cannot rent a second bike. */
    @Test
    public void testRentTwice() {
        Bike other = new Bike(8);
        ann.rent(bike);
        assertFalse(ann.rent(other));
        assertSame(bike, ann.getBike());
        assertNull(other.getRider());
    }

    /** Tests that a bike cannot be rented by two riders. */
    @Test
    public void testBikeAlreadyRented() {
        ann.rent(bike);
        assertFalse(bob.rent(bike));
        assertNull(bob.getBike());
        assertSame(ann, bike.getRider());
    }

    /** Tests that giving back removes the link in both directions. */
    @Test
    public void testGiveBack() {
        ann.rent(bike);
        assertSame(bike, ann.giveBack());
        assertNull(ann.getBike());
        assertNull(bike.getRider());
        assertNull(ann.giveBack()); // nothing left to give back
    }
}
