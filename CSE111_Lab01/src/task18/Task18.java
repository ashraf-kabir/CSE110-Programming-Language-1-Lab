package task18;

import java.util.Scanner;

public class Task18 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number: ");
		int n = sc.nextInt();
		int space;

		for (int rowCount = 1; rowCount <= n; rowCount++) {
			for (space = 1; space <= n - rowCount; space++) {
				System.out.print(" ");
			}
			for (int star = space; star <= n; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
