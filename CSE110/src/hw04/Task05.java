package hw04;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter range: ");
		int n = sc.nextInt();

		int x = 0;
		for (int c = 1; c <= n; c++) {
			x = x + (c * c * c);
		}
		System.out.println(x);

	}

}
