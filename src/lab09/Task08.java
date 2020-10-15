package lab09;

/**
 * Task 8
 * Create a String array (size 10) consisting of the words “zero”, “one”, “two”……, “nine”.
 * Then take a number (between 0 and 9) from the user and print that number in words from the array.
 * If the user enters 5, you should print a[5] and output should be “five”.
 */

import java.util.Scanner;

public class Task08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] x = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

		System.out.println("Enter a number from 0 to 9: ");
		int num = sc.nextInt();

		System.out.println(x[num]);

	}

}
