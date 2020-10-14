package hw04;

/**
 * Task 4:
 * Write javacode for the following:
 * Take twenty numbers input from the user and find the minimum from all numbers and the average of the even numbers
 * entered by the user. [If the user enters odd numbers ignore them]
 */

import java.util.Scanner;

public class Task04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:");
        double n = sc.nextDouble();

        double min = n;
        double sum = 0;

        int evenCount = 0;
        if (n % 2 == 0) {
            sum = n;
            evenCount++;
        }

        for (int i = 1; i <= 19; i++) {
            System.out.println("Enter number:");
            double m = sc.nextDouble();
            if (m < min) {
                min = m;
            }
            if (m % 2 == 0) {
                sum += m;
                evenCount++;
            }
        }

        double avg = sum / evenCount;
        System.out.println("Average of even numbers = " + avg);
        System.out.println("Minimum number = " + min);
    }

}
