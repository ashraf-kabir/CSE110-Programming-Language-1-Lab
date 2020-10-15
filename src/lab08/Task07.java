package lab08;

/**
 * Task 7
 * Write a java program that reads 10 numbers from the user and prints the last even number in the list.
 */

import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n[] = new int[10];

		for (int a = 0; a < n.length; a++) {
			System.out.println("Enter number: ");
			n[a] = sc.nextInt();
		}

		for (int b = n.length - 1; b >= 0; b--) {
			if (n[b] % 2 == 0) {
				System.out.println("The last even number is = " + n[b]);
				break;
			} else {
				if (b == n.length - 1) {
					System.out.println("There is no even number.");
				}
			}
		}

	}

}
