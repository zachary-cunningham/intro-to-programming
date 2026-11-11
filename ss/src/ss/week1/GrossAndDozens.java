package ss.week1;
import java.util.Scanner;



public class GrossAndDozens {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("How many eggs?");
//        int total = input.nextInt();
        int total = 1342;
        int gross = total / 144;
        int remainder = total % 144;

        int dozens = remainder / 12;
        int singles = remainder % 12;

        System.out.println("Your number of eggs is " + gross + " gross, " + dozens + " dozen, and " + singles);
    }
}
