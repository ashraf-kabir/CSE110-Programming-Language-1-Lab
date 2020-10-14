package hw04;

/**
 * Task 28:
 * Modify Task 26, instead of counting factors, print sum of factors.
 */

import java.util.Scanner;

public class Task28 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        
        int factSum = 0;
        
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factSum += i;
            }
        }
        System.out.println("The summation of all factors is = " + factSum);
    }
    
}
