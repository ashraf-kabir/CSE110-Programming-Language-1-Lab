package hw04;

/**
 * Task 1:
 * Write javacode for the following:
 * 1) Ask the user to enter the name of his favorite car.
 * 2) Ask the user to enter a Number
 * 3) Display the name of the user’s favorite car, number of time specified in the second step.
 * Example: If the user enters “Toyota” and 20, your program should print the name Toyota twenty times.
 */

import java.util.Scanner;

public class Task01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your favourite car's name: ");
        String x = sc.nextLine();

        System.out.println("How many times do you want to see that name: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(x);
        }

    }

}
