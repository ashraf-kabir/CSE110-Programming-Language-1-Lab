package lab08;

/**
 * Task 10
 * Write a java program that reads 10 numbers from the user. After reading each number, print all the numbers that have been entered so far.
 * After user enters 11, print 11
 * After user enters 22, print 11, 22
 * …
 * After user enters 99, print 11, 22 ….. 99
 */

import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n[] = new int[10];

		for (int a = 0; a < n.length; a++) {
			System.out.println("Enter number: ");
			n[a] = sc.nextInt();
			for (int b = 0; b <= a; b++) {
				System.out.print(n[b] + " ");
			}
			System.out.println();
		}

	}

}
