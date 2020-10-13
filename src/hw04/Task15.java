package hw04;

/**
 * Task 15:
 * Write javacode of a program that will read 20 numbers from the user, and then print the sum of first number,
 * then sum of the first 2 numbers, sum of first 3 numbers, and so on up to the sum of 20 numbers.
 */

import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int sum = 0;

		for (int i = 1; i <= 20; i++) {
			System.out.println("Enter number: ");
			int num = sc.nextInt();
			sum += num;
			System.out.println(sum);
		}
	}

}
