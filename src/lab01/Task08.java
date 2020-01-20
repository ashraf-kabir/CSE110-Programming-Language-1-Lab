package lab01;

import java.util.Scanner;

public class Task08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number: ");
		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("The inputted number is even.");
		} else {
			System.out.println("The inputted number is odd.");
		}
	}

}
