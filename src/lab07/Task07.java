package lab07;

import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter range:");
		int row = sc.nextInt();

		for (int rowC = 1; rowC <= row; rowC++) {
			for (int space = 1; space <= row - rowC; space++) {
				System.out.print(" ");
			}
			for (int star = 1; star <= rowC; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
