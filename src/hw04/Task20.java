package hw04;

/**
 * Task 20:
 * Write javacode of a program which takes a number and prints the digits from unit place, then tenth, then hundredth, etc.
 * Example: if user gives 32768, then print 8, 6, 7, 2, 3
 * Hint: Taking remainder/modulus of division by 10.
 * After printing the remainder, drop the last digit by dividing by 10. Then start over.
 * 32768 % 10 = 8
 * 32768 / 10 = 3276
 * 3276 % 10 = 6
 * 3276 / 10 = 327
 * 327 % 10 = 7
 * 327 / 10 = 32
 * 32 % 10 = 2
 * 32 / 10 = 3
 * 3 % 10 = 3
 * 3 / 10 = 0
 */

import java.util.Scanner;

public class Task20 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int a = sc.nextInt();
        int b = 1;

        for (; a > 0; a /= 10) {
            b = a % 10;
            System.out.print(b + ", ");
        }
        System.out.println();
    }

}
