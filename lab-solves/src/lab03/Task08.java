package lab03;

import java.util.Scanner;

public class Task08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter mark for a single subject: ");
		int x = sc.nextInt();

		if (x >= 0 && x < 50) {
			System.out.println("F");
		} else if (x >= 50 && x <= 59) {
			System.out.println("E");
		} else if (x >= 60 && x <= 69) {
			System.out.println("D");
		} else if (x >= 70 && x <= 79) {
			System.out.println("C");
		} else if (x >= 0 && x <= 89) {
			System.out.println("B");
		} else if (x >= 90 && x <= 100) {
			System.out.println("A");
		} else {
			System.out.printf("Wrong input!\n");
		}
	}

}
