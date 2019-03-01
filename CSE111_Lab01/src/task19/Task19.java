package task19;

import java.util.Scanner;

public class Task19 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number:");
		int a = sc.nextInt();

		for (int rowC = 1; rowC <= a; rowC++) {
			for (int space = 0; space < a - rowC; space++) {
				System.out.print(" ");
			}
			for (int star = 1; star <= 2 * rowC - 1; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
