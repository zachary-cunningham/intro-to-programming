package ss.week1;
import java.util.Scanner;

public class Fibonnaci {
    /**
     * method fib(n):
     *  if n = 0: return 0
     *  elif n = 1: return 1
     *  else: return fib(n-1) + fib(n-2);
     * **/

    public static long fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give a number buddy");
        int num = input.nextInt();
        long output = fibonacci(num);
        System.out.println("The fibonnaci number at index " + num + " is " + output);

    }
}
