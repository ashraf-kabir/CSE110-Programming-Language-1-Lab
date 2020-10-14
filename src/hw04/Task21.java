package hw04;

/**
 * Task 21:
 * Write javacode of a program which takes a number and prints the digits from left to right.
 * Example: if user gives 32768, then print 3, 2, 7, 6, 8
 * Hint: count how many digits
 * calculate 10 to the power that (number of digits) minus 1.
 * Say, 32768 has 5 digits, so you calculate 10 to the power 4 which is 10000.
 * Then divide 32768 by 10000 and thus you get 3.
 * take remainder of 32768 by 10000 and thus you get 2768
 * Then divide 10000 by 10 to get 1000
 * Then divide 2768 by 1000 and thus you get 2.
 * take remainder of 2768 by 1000 and thus you get 768
 * keep going on until there is no more digits left (zero!).
 * In short:
 * Loop 1: First count digits, say 5 in this case for 32768
 * Loop 2: Then calculate 10 to the power 4 (5-1), that is 10000.
 * Loop 3: Then repeat following three steps
 * 32768 / 10000 = 3
 * 32768 % 10000 = 2768
 * 10000/10 = 1000
 * 2768 / 1000 = 2
 * 2768 % 1000 = 768
 * 1000/10 = 100
 * 768 / 100 = 7
 * 768 % 100 = 68
 * 100/10 = 10
 * 68 / 10 = 6
 * 68 % 10 = 8
 * 10/10 = 1
 * 8 / 1 = 8
 * 8 % 1 = 0
 * 1/10 = 0
 */

import java.util.Scanner;

public class Task21 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number:");
        int num = sc.nextInt();
        
        int digitC = 0;
        int m = 0;
        for (int temp = num; temp > 0; temp /= 10) {
            digitC++;
        }
        int count = digitC;
        
        double prod = Math.pow(10, digitC - 1);
        int p = (int) prod;
        
        while (num > 0) {
            m = num / (int) prod;
            num %= (int) prod;
            prod /= 10;
            System.out.print(m+", ");
        }
        System.out.println("\n"+count);
        System.out.println(p);
    }
    
}
