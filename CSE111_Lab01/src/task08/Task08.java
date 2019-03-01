package task08;

import java.util.Scanner;

public class Task08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value of row:");
		int row = sc.nextInt();
		System.out.println("Enter the value of column:");
		int column = sc.nextInt();

		for (int rowCount = 1; rowCount <= row; rowCount++) {
			for (int colCount = 1; colCount <= column; colCount++) {
				if (rowCount == 1 || rowCount == row || colCount == 1 || colCount == column) {
					System.out.print(colCount);

				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
