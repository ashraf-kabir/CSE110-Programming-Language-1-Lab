package lab07;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter range: ");
		int row = sc.nextInt();

		for (int rowC = 1; rowC <= row; rowC++) {
			for (int colC = 1; colC <= rowC; colC++) {
				System.out.print(colC);
			}
			System.out.println();
		}
	}

}
