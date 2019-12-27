package hw03;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your income: ");
		int income = sc.nextInt();

		System.out.println("Enter your age: ");
		int age = sc.nextInt();

		if (income < 10000) {
			System.out.println("No tax");
		} else if (age < 18) {
			System.out.println("No tax");
		} else if (income >= 10000 && income < 20000) {
			double x = income * 0.05;
			System.out.println("You've to pay = " + x);
		} else if (income >= 20000) {
			double y = income * 0.10;
			System.out.println("You've to pay = " + y);
		}
	}

}
