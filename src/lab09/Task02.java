package lab09;

/**
 * Task 2
 * Write a program which reads 5 numbers into an array and prints the largest number and its location in the array.
 * If the user enters 7, 13, 2, 10, 6 then your program should print “largest number 13 was found at location 1”.
 */

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] n = new int[5];

		for (int a = 0; a < n.length; a++) {
			System.out.println("Enter number: ");
			n[a] = sc.nextInt();
		}

		int max = n[0];
		int maxLoc = 0;

		for (int b = 0; b < n.length; b++) {
			if (n[b] > max) {
				max = n[b];
				maxLoc = b;
			}
		}
		System.out.println("The largest number is " + max);
		System.out.println("The position of it's index is " + maxLoc);
	}

}
