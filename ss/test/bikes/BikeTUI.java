package bikes;

import java.util.Scanner;

import ss.week2.bikes.Bike;
import ss.week2.bikes.Rider;
import ss.week2.bikes.Station;

/**
 * A text user interface for one station of a bike-sharing system, with a
 * fixed group of riders.
 */
public class BikeTUI {
    /** The command to rent a bike. */
    private static final String RENT = "rent";
    /** The command to return a bike. */
    private static final String RETURN = "return";
    /** The command to print the station. */
    private static final String PRINT = "print";
    /** The command to print the help menu. */
    private static final String HELP = "help";
    /** The command to stop. */
    private static final String EXIT = "exit";

    /** The station. */
    private final Station station;
    /** The riders who may rent bikes. */
    private final Rider[] riders;

    /**
     * Creates a text user interface.
     * @param station the station
     * @param riders the riders who may rent bikes
     */
    public BikeTUI(Station station, Rider[] riders) {
        this.station = station;
        this.riders = riders;
    }

    /**
     * Reads and executes commands until the user types exit.
     */
    public void run() {
        printHelp();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.print("> ");
            String[] words = scanner.nextLine().trim().split("\\s+");
            String command = words[0];
            String name = null;
            if (words.length > 1) {
                name = words[1];
            }
            switch (command) {
                case RENT:
                    doRent(name);
                    break;
                case RETURN:
                    doReturn(name);
                    break;
                case PRINT:
                    System.out.println(station);
                    break;
                case HELP:
                    printHelp();
                    break;
                case EXIT:
                    exit = true;
                    break;
                default:
                    System.out.println("Unknown command: " + command);
                    printHelp();
            }
        }
    }

    /**
     * Returns the rider with the given name.
     * @param name the name, or null
     * @return the rider, or null if there is no rider with that name
     */
    private Rider findRider(String name) {
        return null; // TODO
    }

    /**
     * Lets a rider rent a bike from the station, and reports the result.
     * @param name the name of the rider, or null if none was given
     */
    private void doRent(String name) {
        // TODO
    }

    /**
     * Lets a rider return their bike to the station, and reports the
     * result.
     * @param name the name of the rider, or null if none was given
     */
    private void doReturn(String name) {
        // TODO
    }

    /**
     * Prints the available commands.
     */
    private void printHelp() {
        System.out.println("Commands: " + RENT + " name, " + RETURN
                + " name, " + PRINT + ", " + HELP + ", " + EXIT);
    }

    /**
     * Starts the text interface for a station Central with five docks and
     * three bikes, and the riders Ann, Bob and Cem.
     * @param args not used
     */
    public static void main(String[] args) {
        Station station = new Station("Central", 5);
        for (int i = 1; i <= 3; i++) {
            station.park(new Bike(i));
        }
        Rider[] riders = {new Rider("Ann"), new Rider("Bob"),
                          new Rider("Cem")};
        new BikeTUI(station, riders).run();
    }
}
