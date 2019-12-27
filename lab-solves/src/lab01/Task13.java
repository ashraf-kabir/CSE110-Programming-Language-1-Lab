package lab01;

import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		for (int a = 1; a <= 5; a++) {
			System.out.println("Enter number: ");
			int num = sc.nextInt();

			if (num % 2 == 0) {
				System.out.println("Even");
			} else {
				System.out.println("Odd");
			}
		}
	}

}
