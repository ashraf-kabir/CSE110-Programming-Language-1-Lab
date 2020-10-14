package hw04;

/**
 * Task 13:
 * Write javacode of a program that reads a number N, and prints out the sum of all odd numbers from 1 to N inclusive.
 * For instance, if the input is 6, the output for the program should be 9.
 */

import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number: ");
		int N = sc.nextInt();

		int sum = 0;

		for (int i = 1; i <= N; i++) {
			if (i % 2 != 0) {
				sum += i;
			}
		}
		System.out.println(sum);

	}

}
