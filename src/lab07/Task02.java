package lab07;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter range: ");
		int r = sc.nextInt();

		for (int c = 1; c <= r; c++) {
			System.out.print("*");
		}
		System.out.println();
	}

}
