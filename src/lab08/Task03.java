package lab08;

/**
 * Task 3
 * Write a java program that reads 10 numbers from the user, and then prints them in the reverse order.
 */

import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a[] = new int[10];

        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter number:");
            a[i] = sc.nextInt();
        }

        String num = "";
        for (int i = a.length - 1; i >= 0; i--) {
            num += a[i] + ", ";
        }
        System.out.print(num.substring(0, num.length() - 2));

    }

}
