package hw04;

/**
 * Task 29:
 * Modify Task 26, calculate sum of factors less than the number itself. If the sum equals to the number, then print that the number is a perfect number.
 * Example 1: User enters n = 6. Factors of 6 are 1, 2, 3. Sum of those factors 1+2+3=6 which is same as the number 6(n). So, print that 6 is a perfect number.
 * Example 2: If user enters 8. Factors of 8 are 1, 2, 4. Sum of those factors 1+2+4=7 (NOT equal to 8). So, print that 8 is NOT a perfect number.
 */

import java.util.Scanner;

public class Task29 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        
        int sum = 0;
        
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (n == sum) {
            System.out.println("Your input is a perfect number.");
        } else {
            System.out.println("Your input is not a perfect number.");
        }
    }
    
}
