package hw04;

/**
 * Task 12:
 * Solve Task 10 for numbers that are multiples of 4, instead of odd numbers.
 */

import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int sum = 0;
		int count = 0;

		for (int a = 0; a <= 10; a++) {
			System.out.println("Enter number :");
			int n = sc.nextInt();

			if (n % 4 == 0) {
				count++;
				sum += n;
			}
		}
		double avg = sum / count;
		System.out.println(sum);
		System.out.println(avg);

	}

}
