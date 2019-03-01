package task06;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number:");
		int a = sc.nextInt();

		for (int rowC = 1; rowC <= a; rowC++) {
			for (int space = 0; space < a - rowC; space++) {
				System.out.print(" ");
			}
			for (int number = 1; number <= 2 * rowC - 1; number++) {
				System.out.print(number);
			}
			System.out.println();
		}
	}

}
