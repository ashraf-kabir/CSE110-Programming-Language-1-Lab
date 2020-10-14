package hw04;

/**
 * Task 22:
 * Telling words: Write javacode of a program that takes a number between 0 and 9. You have to print that
 * number in words.
 * Hint: if n == 1, then print "one"
 * else if n == 2, then print "two"
 */

import java.util.Scanner;

public class Task22 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        
        if (n == 0) {
            System.out.println("Zero");
        } else if (n == 1) {
            System.out.println("One");
        } else if (n == 2) {
            System.out.println("two");
        } else if (n == 3) {
            System.out.println("Three");
        } else if (n == 4) {
            System.out.println("Four");
        } else if (n == 5) {
            System.out.println("Five");
        } else if (n == 6) {
            System.out.println("Six");
        } else if (n == 7) {
            System.out.println("Seven");
        } else if (n == 8) {
            System.out.println("Eight");
        } else if (n == 9) {
            System.out.println("Nine");
        } else {
            System.out.println("Wrong input");
        }
    }
    
}
