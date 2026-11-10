package ss.week1;
import java.util.Scanner;

public class NumberGuesser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num = Math.floor(Math.random() * 100);
        boolean correct = false;

        while (correct == false) {
            System.out.println("Guess a number between 1 and 100");
            int guess = input.nextInt();

            if (guess < num) {
                System.out.println("Too low, guess again");
            }
            if (guess > num) {
                System.out.println("Too high, guess again");
            }

            if (guess == num) {
                System.out.println("You got it, it's " + guess);
                correct = true;
            }

        }
    }
}
