package hw03;

import java.util.Scanner;

public class Task09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first number: ");
		int a = sc.nextInt();

		System.out.println("Enter second number: ");
		int b = sc.nextInt();

		System.out.println("Enter third number: ");
		int c = sc.nextInt();

		if (a > b && a > c) {
			System.out.println("First input is the largest");
		} else if (b > a && b > c) {
			System.out.println("Second input is the largest");
		} else {
			System.out.println("Third input is the largest");
		}
	}

}
