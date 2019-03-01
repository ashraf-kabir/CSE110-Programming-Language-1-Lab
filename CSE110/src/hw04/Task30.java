package hw04;

import java.util.Scanner;

public class Task30 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter starting number: ");
		int n = sc.nextInt();

		System.out.println("Enter ending number: ");
		int m = sc.nextInt();

		int primeC = 0;
		int perfectC = 0;

		for (; n <= m; n++) {
			int sum = 0;
			int factorC = 0;

			for (int divisor = 1; divisor < n; divisor++) {
				if (n % divisor == 0) {
					sum += divisor;
					factorC++;
				}
			}
			if (factorC == 0) {
				primeC++;
			}
			if (sum == n) {
				perfectC++;
			}
		}
		System.out.println(primeC + " Prime number");
		System.out.println(perfectC + " Perfect number");
	}

}
