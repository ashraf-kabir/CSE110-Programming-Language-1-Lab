package lab07;

import java.util.Scanner;

public class Task17 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value of row:");
		int row = sc.nextInt();

		for (int rowCount = 1; rowCount <= row; rowCount++) {
			for (int colCount = 1; colCount <= rowCount; colCount++) {
				if (rowCount == 1 || rowCount == row || rowCount == 2 || colCount == 1 || colCount == rowCount) {
					System.out.print(colCount);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
