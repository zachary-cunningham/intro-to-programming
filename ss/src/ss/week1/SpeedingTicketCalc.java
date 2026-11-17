package ss.week1;
import java.util.*;

/**
 *
 *
 *
 * */

public class SpeedingTicketCalc {
    public static void main(String[] args) {

        System.out.println("Enter the speed limit: ");
        Scanner input = new Scanner(System.in);
        int limit = input.nextInt();

        int[] speeds = {
                78, 85, 93, 102, 81, 77, 110, 120, 99, 83, 75, 88,
                97, 115, 100, 79, 80, 90, 104, 112, 70, 82, 86, 130, 84
        };

        for (int i = 0; i < speeds.length; i++){

            if (speeds[i]<=limit) {
                System.out.println("No fine for your speed "+ speeds[i] + " km/h");
            } else if (speeds[i] > limit && speeds[i] <= limit + 10) {
                System.out.println("€50 for at most 10 km/h over, your speed: "+ speeds[i] + " km/h");
            } else if (speeds[i] > limit + 10 && speeds[i] <= limit + 20) {
                System.out.println("€100 for at most 20 km/h over, your speed: "+ speeds[i] + " km/h");
            } else if (speeds[i] > limit + 20) {
                System.out.println("€200 for more than 20 km/h over, your speed: "+ speeds[i] + " km/h");
            }

        }

;    }
}
