package ss.week1;
import java.util.Scanner;
import java.util.concurrent.locks.AbstractOwnableSynchronizer;

public class MonthlyPayment {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What's the amount borrowed?");
        int borrowed = input.nextInt(); // P

        System.out.println("What is the yearly interest rate (in %)?");
        double interest = input.nextDouble() / 100;

        System.out.println("What is the number of years?");
        int years = input.nextInt();

        double r = interest / 12; // monthly interest rate
        int N = years * 12; // num monthly payments

        double payment;
        if (r == 0) {
            payment = borrowed / N;
        } else {
            payment = (r / (1 - Math.pow((1 + r), -N))) * borrowed;
        }

        payment = Math.round(payment);
        System.out.println("The monthly payment is " + payment);
    }
}
