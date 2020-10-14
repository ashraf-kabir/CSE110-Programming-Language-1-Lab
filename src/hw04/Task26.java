package hw04;

/**
 * Task 26:
 * If a number is NOT divisible any number other than 1 and itself, then it is called prime number.
 * For example, 13 is a prime number because it is NOT divisible by any number other than 1 and 13 (itself).
 * Take one number from the user and tell if it is prime number or not.
 * Hint: Use the technique from Task 25 and count factors of the input.
 * Factors are those numbers between 1 and n that can divide the number, n.
 * If there are more than two factors (1 and n), then the number, n is not prime because it was divisible by other numbers.
 */

import java.util.Scanner;

public class Task26 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number:");
        int n = sc.nextInt();
        
        int primeC = 0;
        
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                primeC++;
            }
        }
        
        if (primeC == 0) {
            System.out.println("Your input is a prime number.");
        } else {
            System.out.println("Your input is not a prime number.");
        }
    }
    
}
