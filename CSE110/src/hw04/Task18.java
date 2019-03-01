package hw04;

import java.util.Scanner;

public class Task18 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int num = sc.nextInt();

		for (int c = 0;; c++) {
			if (num != 0) {
				num /= 10;
			}
			System.out.print(c);
		}

	}

}
