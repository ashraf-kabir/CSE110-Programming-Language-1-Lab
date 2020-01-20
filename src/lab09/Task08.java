package lab09;

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
