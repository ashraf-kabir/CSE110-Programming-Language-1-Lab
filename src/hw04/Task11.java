package hw04;

/**
 * Task 11:
 * Solve Task 10 for even numbers instead of odd numbers.
 */

import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int sum = 0;
		int evenC = 0;

		for (int a = 1; a <= 6; a++) {
			System.out.println("Enter number :");
			int n = sc.nextInt();

			if (n % 2 == 0) {
				evenC++;
				sum += n;
			}
		}
		double avg = sum / evenC;
		System.out.println(sum);
		System.out.println(avg);

	}

}
