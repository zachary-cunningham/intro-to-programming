package ss.week1;

import java.util.Scanner;

public class HighestDigit {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        System.out.println("The highest digit of the number is: " + returnHighest(num));
    }

    public static int returnHighest(int n){
        if (n < 10){
            return n;
        }
        int lastDigit = n % 10;
        int highestOfRest = returnHighest(n / 10);
        return Math.max(lastDigit, highestOfRest);
    }

}
//could get to the next digit by moding it to 10, 100, 1000...
//then compare the mod-ed numbers and spit out the max?
