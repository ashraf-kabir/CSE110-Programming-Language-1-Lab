package hw04;

/**
 * Task 14:
 * Write javacode of a program that reads a list of numbers, and prints out the product of all the numbers read.
 * You may assume that the user first inputs the total number of numbers. For example, if the first input is 4,
 * then the program has to read in four numbers from the user, and print out the product of these four numbers.
 * Assume that user will never enter first number as zero.
 */

import java.util.Scanner;

public class Task14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double prod = 1;

        System.out.println("Enter range:");
        int r = sc.nextInt();

        for (int i = 0; i < r; i++) {
            System.out.println("Enter a number:");
            double x = sc.nextDouble();
            prod = prod * x;
        }
        System.out.println("The product is " + prod);
    }

}
