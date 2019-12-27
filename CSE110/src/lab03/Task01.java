package lab03;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int num = sc.nextInt();

		if (num % 2 == 0 && num > 10) {
			System.out.println("An even number greater than 10");
		} else if (num % 2 == 0 && num < 10) {
			System.out.println("An even number not greater than 10");
		} else if (num % 2 != 0 && num > 10) {
			System.out.println("An odd number greater than 10");
		} else if (num % 2 != 0 && num < 10) {
			System.out.println("An odd number less than 10");
		}
	}

}
