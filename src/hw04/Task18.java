package hw04;

/**
 * Task 18:
 * Write javacode of a program which takes a number and tells how many digits are in that number.
 * Example: if user gives 9876, you should print 4.
 * Hint: keep dividing by ten and count how many times this could be divided.
 * 9876 by 10, is 987, count that got 1 digit
 * 987 by 10, is 98, count that got 1 digit (total 2)
 * 98 by 10, is 9, count that got 1 digit (total 3)
 * 9 by 10, is 0, count that got 1 digit (total 4)
 * done!
 */

import java.util.Scanner;

public class Task18 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        
        int c = 0;
        while (num > 0) {
            num /= 10;
            c++;
        }
        System.out.println(c);
        
    }
    
}
