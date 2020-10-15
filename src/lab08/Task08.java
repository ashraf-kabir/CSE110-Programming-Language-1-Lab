package lab08;

/**
 * Task 8
 * Write a java program that reads 10 numbers from the user, and then prints only the even numbers in reverse order.
 */

import java.util.Scanner;

public class Task08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n[] = new int[10];

		for (int a = 0; a < n.length; a++) {
			System.out.println("Enter number: ");
			n[a] = sc.nextInt();
		}

		for (int b = n.length - 1; b >= 0; b--) {
			if (n[b] % 2 == 0) {
				System.out.println(n[b]);
			}
		}

	}

}
