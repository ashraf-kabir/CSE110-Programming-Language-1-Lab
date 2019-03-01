package task20;

import java.util.Scanner;

public class Task20 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int a = sc.nextInt();

		for (int b = 1; b <= a; b++) {
			for (int space = 1; space <= a - b; space++) {
				System.out.print(" ");
			}
			for (int c = 1; c <= 2 * b - 1; c++) {
				System.out.print("*");
			}
			System.out.println();
		}
		int j = 1;
		int t = 2 * a - 3;

		for (int i = 1; i < a; i++) {
			for (int p = 1; p <= j; p++) {
				System.out.print(" ");
			}
			j++;

			for (int d = 1; d <= t; d++) {
				System.out.print("*");
			}
			t -= 2;
			System.out.println();
		}
	}

}
