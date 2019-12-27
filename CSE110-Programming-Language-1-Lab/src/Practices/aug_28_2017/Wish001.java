package Practices.aug_28_2017;

import java.util.Scanner;

public class Wish001 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your name: ");
		String name = sc.next();

		System.out.println("Your age: ");
		int age = sc.nextInt();

		switch (age) {
		case 17:                          //case works like if statement
			System.out.println("HBD " + name + " & you're a teenager.");
			break;
		case 18:
			System.out.println("HBD " + name + " & you're an adult.");
			break;
		default:                          //default works like else statement
			System.out.println("run the program again");
			break;
		}
	}

}
