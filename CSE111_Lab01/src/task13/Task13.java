package task13;

import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number:");
		int a = sc.nextInt();

		for (int b = 1; b <= a; b++) {
			System.out.print(b);
		}
		for (int c = a - 1; c > 0; c--) {
			System.out.print(c);
		}
		System.out.println();
	}

}
