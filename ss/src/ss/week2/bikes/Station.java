package ss.week2.bikes;


/**
 * 1. Write the class Station, with Javadoc. Keep the docks in an array of bikes, in which null means
 * an empty dock. It has:
 * • a constructor with the name and the number of docks, which are all empty at first;
 * • queries getName(), countBikes() and isFull();
 *
 *
 * • park(bike): puts a bike that is not rented, and not parked at any station, into the first empty
 * dock, and returns whether that worked. Making sure the bike is not parked elsewhere is the job
 * of the code that calls park;
 *
 * • rentBike(rider): lets the rider rent the bike from the first dock that holds one, and returns
 * that bike; nothing changes (and it returns null) if the rider already has a bike or there is no
 * bike at the station. A parked bike must always be rented this way, never with rent of Rider
 * directly: that would leave a rented bike in a dock. Add this precondition to the Javadoc of
 * rent;
 * • returnBike(rider): lets the rider give back their bike and parks it here, and returns whether
 * that worked; nothing changes if the rider has no bike or the station is full.
 * **/
public class Station {
    Bike[] docks;
    String name;
    int index;

    /**
     * Constructor.
     * @param name of station
     * @param docks in station
     * **/
    public Station(String name, int docks) {
        this.docks = new Bike[docks];
        this.name = name;
        this.index = 0;
    }
    public Station() {
        this("My Station", 10);
    }

    /**
     * Prints "StationName: Bike X, Bike Y, etc"
     * **/
    public String toString() {
        String msg = this.name + ": ";
        for(var i = 0; i < this.docks.length; i++) {
            msg = msg + this.docks[i].toString();
        }

        return msg;
    }

    /**
     * @return name(String) of station
     * **/
    public String getName() {
        return this.name;
    }

    /**
     * @return the number(int) of bikes stored
     * **/
    public int countBikes() {
        return index;
    }

    /***
     * @return whether the station is fill
     * **/
    public boolean isFull() {
        // if the "next item" is overflow.
        return (this.index == this.docks.length);
    }

//    public Bike getFirstBike() {
//        if((this.docks[0] != null) && (this.docks[0] != 0))
//    }

    /**
     * park(bike): puts a bike that is not rented, and not parked at any station, into the first empty
     * dock, and returns whether that worked. Making sure the bike is not parked elsewhere is the job
     * of the code that calls park;
     *
     * @param bike to park
     * @return whether action was successful
     * **/

    //boolean isParked = false;
    //            int i = 0;
    //            while ((i < this.index) && (!isParked)) {
    //                if (bike == this.docks[i]) {
    //                    isParked = true;
    //                }
    //                i++;
    //            }
    //
    //            if (!isParked) {
    //                // call the function
    //            }


    public boolean park(Bike bike) {
        if (bike.getRider() == null) {
            this.docks[this.index] = bike;
            this.index++;

            return true;
        } else { return false;}
    }

    /**
     * • rentBike(rider): lets the rider rent the bike from the first dock that holds one, and returns
     * that bike; nothing changes (and it returns null) if the rider already has a bike or there is no
     * bike at the station.**/
    public Bike rentBike(Rider rider) {
        // check if rider already has a bike, or if there are no bikes at the station
        // DONT FORGET TO ADD PRECONDITION TO RENT JAVADOC

        if (rider.getBike() == null && this.index != 0) {
            rider.rent(this.docks[0]);

            // shift all up to the left of array
            for(var i = 0; i < this.index - 1; i++) {
                this.docks[i] = this.docks[i + 1];
            }

            this.index --;

            return this.docks[0];
        } else { return null; }
    }

    /**
     * returnBike(rider): lets the rider give back their bike and parks it here, and returns whether
     * that worked; nothing changes if the rider has no bike or the station is full.
     * **/
    public boolean returnBike(Rider rider) {
        if ((rider.getBike() == null) || (this.isFull())) {
            return false;
        } else {
            Bike ridersBike = rider.getBike();

            rider.giveBack();
            
            this.park(ridersBike);

            return true;
        }
    }
}
