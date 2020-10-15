package lab01;

import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 5; i++) {
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
