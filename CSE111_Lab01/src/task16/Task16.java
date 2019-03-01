package task16;

import java.util.Scanner;

public class Task16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter row's range: ");
		int row = sc.nextInt();
		System.out.println("Enter coloumn's range: ");
		int col = sc.nextInt();

		for (int a = 1; a <= row; a++) {
			for (int b = 1; b <= col; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
