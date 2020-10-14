package hw04;

/**
 * Task 5:
 * Write javacode that reads the value of n and calculates the value of y if the expression of y is as follows:
 * y = 1^3 + 2^3 + 3^3 + 4^3 + 5^3 + 6^3 + ............+ n^3
 */

import java.util.Scanner;

public class Task05 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter range:");
        int n = sc.nextInt();
        
        int x = 0;
        for (int i = 1; i <= n; i++) {
            x = x + (i * i * i);
        }
        System.out.println(x);
    }
    
}
