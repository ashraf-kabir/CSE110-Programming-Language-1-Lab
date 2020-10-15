package lab07;

import java.util.Scanner;

public class Task09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter range:");
		int a = sc.nextInt();

		int b = 1;
		for (int rC = 1; rC <= a; rC++) {
			for (int space = 1; space <= a - rC; space++) {
				System.out.print(" ");
			}
			for (int star = 1; star <= b; star++) {
				System.out.print("*");
			}
			b += 2;
			System.out.println();
		}
	}

}
