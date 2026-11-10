package ss.week1;
import java.util.Scanner;

/** IP 1.9 **/

public class IncomeTax {
    public static void main(String[] args) {
        System.out.println("What is your income?");
        Scanner input = new Scanner(System.in);

        int I = input.nextInt(); // income
        double tax;

        if (I <= 35472) {
            tax = 0.0942 * I;
        } else if (I <= 69398) {
            tax = 3341 + (0.3707 * (I - 35472));
        } else {
            tax = 15917 + (0.4950 * (I - 69398));
        }

        System.out.println("Your income tax is: " + tax);
    }
}
