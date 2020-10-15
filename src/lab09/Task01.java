package lab09;

/**
 * Task 1
 * Write a program which reads 5 numbers into an array and prints the largest number.
 * If the user enters 7, 13, 2, 10, 6 then your program should print 13.
 */

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] n = new int[5];

		for (int a = 0; a < n.length; a++) {
			System.out.println("Enter number: ");
			n[a] = sc.nextInt();
		}
		int max = n[0];

		for (int b = 0; b < n.length; b++) {
			if (n[b] > max) {
				max = n[b];
			}
		}
		System.out.println("The largest number id = " + max);

	}

}
