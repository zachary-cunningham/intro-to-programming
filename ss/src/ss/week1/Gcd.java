package ss.week1;

/**
 * gcd(a,0) = a
 * gcd(a,b) = gcd(b,a mod b), for b > 0
 *
 * Here a mod b is the remainder a % b. Write th
 * **/


public class Gcd {
    public static int gcd(int a, int b) {
        if (b == 0) {return a;}
        else {
            return gcd(b, a % b);
        }
    }

    public static void main(String[] args) {
        System.out.println(gcd(0, 7));
    }
}
