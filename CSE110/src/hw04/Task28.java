package hw04;

import java.util.Scanner;

public class Task28 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number: ");
		int n = sc.nextInt();

		int factC = 0;

		for (int c = 1; c <= n; c++) {
			if (n % c == 0) {
				factC += c;
			}
		}
		System.out.println("The summation of all factors is = " + factC);
	}

}
