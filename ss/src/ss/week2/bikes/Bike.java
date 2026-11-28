package ss.week2.bikes;


/**
 * • A Bike has a number, and the rider who rents it, or null if it is not rented.
 * • A Rider has a name, and the bike they rent, or null.
 * • rent(bike) lets the rider rent the bike and returns true, but only if the rider has no bike yet and
 * nobody rents the bike; otherwise nothing changes, and it returns false.
 * • giveBack() ends the rental and returns the bike, or returns null if the rider had no bike.
 *
 * WHEN TO USE this vs public/private
 **/

//+ Bike(number: int)
//+ getNumber(): int
//+ getRider(): Rider
//~ setRider(rider: Rider)
public class Bike {
    private Rider rider;
    private int number;


    /** Constructor **/
    public Bike(int number) {
        this.number = number;
        this.rider = null;
        // rider is still null
    }

    public String toString() {
        return "Bike + " + getNumber();
    }

    /**
     * @return the bike number
     * **/
    public int getNumber() {
        return this.number;
    }

    /**
     * @return the bike owner
     * **/
    public Rider getRider() {
        return this.rider;
    }

    /**
     * @param rider to set
     *
     * Package private (not said to be public or private)
     * **/
    void setRider(Rider rider) {
        this.rider = rider;
    }
}

