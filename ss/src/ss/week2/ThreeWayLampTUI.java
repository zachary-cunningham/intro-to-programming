package ss.week2;

import java.util.Scanner;

/**
 * A textual user interface for a {@link ThreeWayLamp}. It repeatedly asks the user for a command
 * and applies it to the lamp. Supported commands: OFF, LOW, MEDIUM, HIGH, STATE, NEXT, HELP, EXIT.
 */
public class ThreeWayLampTUI {

    /** The lamp this interface controls. */
    private final ThreeWayLamp lamp;

    /**
     * Creates a TUI for the given lamp.
     * The lamp is passed in (instead of created here) so the TUI does not depend on how the lamp
     * is built, which keeps the two classes loosely coupled and makes the TUI easy to reuse or test
     * with a lamp in any state.
     *
     * @param lamp the lamp to control
     */
    public ThreeWayLampTUI(ThreeWayLamp lamp) {
        this.lamp = lamp;
    }

    /**
     * Creates a lamp and a TUI for it, and starts the TUI.
     *
     * @param args not used
     */
    public static void main(String[] args) {
        ThreeWayLamp lamp = new ThreeWayLamp();
        ThreeWayLampTUI tui = new ThreeWayLampTUI(lamp);
        tui.run();
    }

    /**
     * Prints the help menu, then reads commands from standard input and acts on them
     * until the user enters EXIT.
     */
    public void run() {
        Scanner scanner = new Scanner(System.in);
        printHelp();
        boolean exit = false;
        while (!exit && scanner.hasNextLine()) {
            String input = scanner.nextLine().trim().toUpperCase();
            switch (input) {
                case "OFF":
                    lamp.changeSetting(ThreeWayLamp.LampSetting.OFF);
                    break;
                case "LOW":
                    lamp.changeSetting(ThreeWayLamp.LampSetting.LOW);
                    break;
                case "MEDIUM":
                    lamp.changeSetting(ThreeWayLamp.LampSetting.MEDIUM);
                    break;
                case "HIGH":
                    lamp.changeSetting(ThreeWayLamp.LampSetting.HIGH);
                    break;
                case "STATE":
                    System.out.println("The lamp is " + lamp.getCurrentSetting());
                    break;
                case "NEXT":
                    lamp.switchSetting();
                    break;
                case "HELP":
                    printHelp();
                    break;
                case "EXIT":
                    exit = true;
                    break;
                default:
                    System.out.println("Unknown command: \"" + input + "\". Type HELP for the list of commands.");
            }
        }
        scanner.close();
    }

    /**
     * Prints the help menu that explains the available commands.
     */
    private void printHelp() {
        System.out.println("""
                Commands:
                  OFF    - set the lamp to OFF
                  LOW    - set the lamp to LOW
                  MEDIUM - set the lamp to MEDIUM
                  HIGH   - set the lamp to HIGH
                  STATE  - print the current setting
                  NEXT   - switch to the next setting (OFF -> LOW -> MEDIUM -> HIGH -> OFF)
                  HELP   - show this menu
                  EXIT   - quit the program""");
    }
}
