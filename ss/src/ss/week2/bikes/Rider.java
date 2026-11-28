package ss.week2.bikes;

/**
 * • A Bike has a number, and the rider who rents it, or null if it is not rented.
 * • A Rider has a name, and the bike they rent, or null.
 * • rent(bike) lets the rider rent the bike and returns true, but only if the rider has no bike yet and
 * nobody rents the bike; otherwise nothing changes, and it returns false.
 * • giveBack() ends the rental and returns the bike, or returns null if the rider had no bike.
 **/
public class Rider {
    String name;
    Bike bike;

    /** Constructor **/
    public Rider(String name) {
        this.name = name;
        this.bike = null;
    }

    public String toString() {
        return "Rider " + this.name;
    }

    /**
     * @return the name of the Rider
     * **/
    public String getName() {
        return this.name;
    }

    /**
     * @return the bike the rider has, or null if no bike
     * **/
    public Bike getBike() {
        return this.bike;
    }

    /**
     * @param bike, to rent that bike
     * @return true/false if action is successful
     *
     * NOTE: this must never be called directly, only through Station.rentBike(Rider rider)
     * **/
    public boolean rent(Bike bike) {
        if (bike.getRider() == null && this.bike == null) {
            bike.setRider(this); // connect this rider to that bike
            this.bike = bike; // connect that bike to this rider

            return true;
        } else {
            return false;
        }

    }

    /**
     * @return the bike returned, or null if Rider had no bike
     * **/
    public Bike giveBack() {
        if(this.bike != null) {
            this.bike.setRider(null); // disconnect rider from bike

            Bike bikeCopy = this.bike;
            this.bike = null;

            return bikeCopy;
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        Bike a = new Bike(1);
        Bike b = a;
        Bike c = new Bike(1);
        Rider ann = new Rider("Ann");
        ann.rent(b);
        System.out.println(a.getRider() == ann); // true - expected false
        System.out.println(c.getRider()); // null
        System.out.println(a == b); // true
        System.out.println(a == c); // false - expected true, as same object type (not instance)
        Rider bob = new Rider("Bob");
        System.out.println(bob.rent(a)); // false - expected true, as ann rented b, not a (clearly she rented both)
        ann.giveBack();
        System.out.println(bob.rent(a)); // true - expected false, as formerly thought bob successfully rented
        Bike[] bikes = {a, c};
        bikes[0] = null;
        System.out.println(a.getNumber()); // 1
    }
}
