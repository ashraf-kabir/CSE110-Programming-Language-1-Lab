package lab07;

import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter range:");
		int a = sc.nextInt();

		int space;
		for (int rC = 1; rC <= a; rC++) {
			for (space = 1; space <= a - rC; space++) {
				System.out.print(" ");
			}
			for (int number = space; number <= a; number++) {
				System.out.print(number);
			}
			System.out.println();
		}
	}

}
