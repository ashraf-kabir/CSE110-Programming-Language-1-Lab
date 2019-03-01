package hw04;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter range: ");
		int n = sc.nextInt();

		int y = 0;
		for (int c = 1; c <= n; c++) {
			if (c % 2 == 0) {
				y -= (c * c);
			} else {
				y += (c * c);
			}
		}
		System.out.println(y);

	}

}
