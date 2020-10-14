package hw04;

/**
 * Task 30:
 * Ask user for a range. Count how many numbers are prime number and how many numbers are perfect numbers between that range.
 * For example, between 2 and 6 there are 3 prime numbers (2, 3, 5) and 1 perfect number (6).
 * Sample Input:
 * 2 6
 * Sample Output:
 * Between 2 and 6,
 * Found 3 prime numbers
 * Found 1 perfect number.
 */

import java.util.Scanner;

public class Task30 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter starting number:");
        int n = sc.nextInt();

        System.out.println("Enter ending number:");
        int m = sc.nextInt();

        int primeC = 0;
        int perfectC = 0;

        for (; n <= m; n++) {
            int sum = 0;
            int factorC = 0;

            for (int divisor = 1; divisor < n; divisor++) {
                if (n % divisor == 0) {
                    sum += divisor;
                    factorC++;
                }
            }
            if (factorC == 2) {
                primeC++;
            }

            if (sum == n) {
                perfectC++;
            }
        }
        System.out.println(primeC + " Prime number");
        System.out.println(perfectC + " Perfect number");
    }

}
