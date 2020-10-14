package hw04;

/**
 * Task 24:
 * Write javacode of a program that takes a number and prints all numbers up to that number.
 * If the user gives 8, print 1 to 8.
 */

import java.util.Scanner;

public class Task24 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            System.out.print(i);
        }
        System.out.println();
    }
    
}
