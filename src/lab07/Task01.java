package lab07;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter range:");
		int r = sc.nextInt();

		for (int i = 1; i <= r; i++) {
			System.out.print(i);
		}
		System.out.println();

	}

}
