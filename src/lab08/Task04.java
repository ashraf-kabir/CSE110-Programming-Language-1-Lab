package lab08;

/**
 * Task 4
 * Write a java program that reads 10 numbers from the user and prints the first odd number in the list.
 */

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int arr[] = new int[10];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter number: ");
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				System.out.println("The first odd number is = " + arr[i]);
				break;
			} else {
				if (i == arr.length - 1) {
					System.out.println("There is no odd number.");
				}
			}
		}

	}

}
