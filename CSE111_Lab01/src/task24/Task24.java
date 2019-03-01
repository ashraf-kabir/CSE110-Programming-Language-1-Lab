package task24;

import java.util.Scanner;

public class Task24 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number:");
		int n = sc.nextInt();

		for (int i = 1; i <= 1; i++) {
			for (int j = 1; j <= n - i; j++) {
				String space = " ";
				System.out.print(space);
			}
			for (int star = 1; star <= 2 * i - 1; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
		int k = 3;
		for (int a = 2; a < n; a++) {
			int d = 2;
			for (int s = 1; s <= n - a; s++) {
				String space = " ";
				System.out.print(space);
			}
			System.out.print("*");

			for (; d < k; d++) {
				String space = " ";
				System.out.print(space);
			}
			System.out.print("*");
			System.out.println();
			k += 2;
		}
		for (int h = 1; h <= 2 * n - 1; h++) {
			System.out.print("*");
		}
		System.out.println();
	}

}
