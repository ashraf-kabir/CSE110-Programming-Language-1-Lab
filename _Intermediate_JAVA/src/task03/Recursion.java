package task03;

import static java.lang.System.out;

public class Recursion {
    public static void main(String[] args) {

        out.println(fact(5));

    }

    //fact
    private static long fact(long n) {
        if (n <= 1) {
            return 1;
        }
        else {
            return n * fact(n-1);
        }
    }
}
