package lab08;

/**
 * Task 2
 * Write a java program that reads 10 numbers from the user. The program then reads a number between 0 to 9,
 * and shows the number at the corresponding index number. For instance, if the array is a and the user enters 3,
 * your program should print the value a[3].
 */

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a[] = new int[10];

		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter number:");
			a[i] = sc.nextInt();
		}

		System.out.println("Enter the serial of index:");
		int n = sc.nextInt();
		System.out.println(a[n]);

	}

}
