package lab01;

import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first number: ");
		int num1 = sc.nextInt();

		System.out.println("Enter second number: ");
		int num2 = sc.nextInt();

		if (num1 > num2) {
			int x = num1 - num2;
			System.out.println("The difference is " + x);
		} else {
			int y = num2 - num1;
			System.out.println("The difference is " + y);
		}
	}

}
