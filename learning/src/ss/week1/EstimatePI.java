package ss.week1;
import java.util.Scanner;

/** IP 1.11 **/

public class EstimatePI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the number of iterations: ");
        double n = input.nextInt();

        double count = 0;
        for (int i = 0; i < n; i++) {
            double x = Math.random();
            double y = Math.random();

            if((Math.pow(x, 2) + Math.pow(y, 2)) <= 1) {
                count++;
                System.out.println("Found one");
            }
        }
        double pi = (4 * count) / n;
        System.out.println("Estimation of pi: " + pi);
    }
}
