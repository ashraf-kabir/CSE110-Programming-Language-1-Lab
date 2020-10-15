package lab09;

/**
 * Task 4
 * Write a program which reads 5 numbers into an array, sorts/arranges the numbers from low to high and prints all numbers in the array.
 * If the user enters 7, 13, 2, 10, 6 then your program should print 2, 6, 7, 10, and 13.
 */

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int temp = 0;
		int n[] = new int[5];

		for (int a = 0; a < n.length; a++) {
			System.out.println("Enter number:");
			n[a] = sc.nextInt();
		}

		for (int a = 0; a < n.length; a++) {
			for (int b = 0; b < n.length; b++) {
				if (n[b] > n[a]) {
					temp = n[a];
					n[a] = n[b];
					n[b] = temp;
				}
			}
		}
		for (int d = 0; d < n.length; d++) {
			System.out.println(n[d]); // low to high
		}

	}

}
