package lab07;

import java.util.Scanner;

public class Task08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter range:");
		int r = sc.nextInt();

		for (int rC = 1; rC <= r; rC++) {
			for (int space = 1; space <= r - rC; space++) {
				System.out.print(" ");
			}
			for (int number = 1; number <= rC; number++) {
				System.out.print(number);
			}
			System.out.println();
		}
	}

}
