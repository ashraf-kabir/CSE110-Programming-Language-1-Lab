package task05;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number:");
		int a = sc.nextInt();

		for (int rowCount = 1; rowCount <= a; rowCount++) {
			for (int space = 1; space <= a - rowCount; space++) {
				System.out.print(" ");
			}
			for (int number = 1; number <= rowCount; number++) {
				System.out.print(number);
			}
			System.out.println(" ");

		}
	}

}
