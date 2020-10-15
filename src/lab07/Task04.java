package lab07;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the range of row:");
		int row = sc.nextInt();

		System.out.println("Enter the range of column:");
		int col = sc.nextInt();

		for (int rowC = 1; rowC <= row; rowC++) {
			for (int colC = 1; colC <= col; colC++) {
				System.out.print(colC);
			}
			System.out.println();
		}

	}

}
