package ss.week1;

/** IP - 1.7 **/

import java.util.Scanner;

public class PolyArea {

    public static void main(String[] args) {
        System.out.println("How many sides is your polygon?");

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        System.out.println("And how long is each side?");

        double s = input.nextDouble();

        double area = (n * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / n));

        System.out.println("The area is: " + area);
    }

}
