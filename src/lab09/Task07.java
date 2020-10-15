package lab09;

/**
 * Task 7
 * Write a java program that reads 10 numbers from the user. Write the program in such a way so that
 * if the user enters 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, then the output should be 1, 3, 5, 7, 9, 2, 4, 6, 8, 10.
 * If the user enters 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, then the output should be 10, 30, 50, 70, 90, 20, 40, 60, 80, 100.
 * If the user enters 2, 5, 6, 9, 12, 13, 14, 15, 16, 17 then the output should be 2, 6, 12, 14, 16, 5, 9, 13, 15, 17.
 */

import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] n = new int[10];

		for (int a = 0; a < n.length; a++) {
			System.out.println("Enter number: ");
			n[a] = sc.nextInt();
		}

		for (int odd = 0; odd < n.length; odd++) {
			if (n[odd] % 2 != 0) {
				System.out.print(n[odd] + ", ");
			}
		}
		System.out.println();

		for (int even = 0; even < n.length; even++) {
			if (n[even] % 2 == 0) {
				System.out.print(n[even] + ", ");
			}
		}

	}

}
