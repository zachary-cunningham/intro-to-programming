package ss.week2;

/**
 * This class records an amount of money as dollars and cents.
 */

public class DollarsAndCentsCounter {

    private int totalCents;

    /**
     * Return the number of whole dollars.
     * @return the number of whole dollars
     */
    //@ ensures \result >= 0;
    //@ pure
    public int getDollars() {
        return totalCents / 100;
    }

    /**
     * Return the amount of cents.
     * @return the amount of cents
     */
    //@ ensures \result >= 0 && \result < 100;
    //@ pure
    public int getCents() {
        return totalCents % 100;
    }

    /**
     * Add the specified amount of dollars and cents to this counter.
     * @param dollars the amount of dollars to add
     * @param cents the amount of cents to add
     */
    /*@ ensures getDollars() * 100 + getCents() ==
          \old(getDollars() * 100 + getCents()) + dollars * 100 + cents;
      @ */

    public void add(int dollars, int cents) {
        totalCents = totalCents + (dollars * 100);
        totalCents = totalCents + cents;
    }

    /**
     * Reset this counter to 0.
     */
    //@ ensures getDollars() == 0 && getCents() == 0;
    public void reset() {
        totalCents = 0;
    }

    public static void main(String[] args) {

        DollarsAndCentsCounter dc = new DollarsAndCentsCounter();
        dc.add(0, 1060);
        System.out.println(dc.getDollars());
        System.out.println(dc.getCents());

    }
}
