package lab07;

import java.util.Scanner;

public class Task09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter range: ");
		int r = sc.nextInt();

		int b = 1;
		for (int rC = 1; rC <= r; rC++) {
			for (int space = 1; space <= r - rC; space++) {
				System.out.print(" ");
			}

			for (int star = 1; star <= rC; star++) {
				System.out.print("*");
			}
			b += 2;
			System.out.println();
		}
	}

}
