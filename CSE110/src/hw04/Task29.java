package hw04;

import java.util.Scanner;

public class Task29 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int n = sc.nextInt();

		int sum = 0;

		for (int c = 1; c < n; c++) {
			if (n % c == 0) {
				sum += c;
			}
		}

		if (n == sum) {
			System.out.println("Your input is a perfect number.");
		} else {
			System.out.println("Your input is not a perfect number.");
		}
	}

}
