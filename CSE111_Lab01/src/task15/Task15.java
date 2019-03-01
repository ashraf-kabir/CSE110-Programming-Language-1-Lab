package task15;

import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter range:");
		int n = sc.nextInt();

		for (int c = 1; c <= n; c++) {
			System.out.print("*");
		}
		System.out.println();
	}

}
