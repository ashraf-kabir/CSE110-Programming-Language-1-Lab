package hw03;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter marks: ");
		int m = sc.nextInt();

		if (m < 0) {
			System.out.println("Wrong Input");
		} else if (m > 100) {
			System.out.println("Wrong Input");
		} else if (m >= 0 && m < 50) {
			System.out.println("F");
		} else if (m >= 50 && m <= 59) {
			System.out.println("E");
		} else if (m >= 60 && m <= 69) {
			System.out.println("D");
		} else if (m >= 70 && m <= 79) {
			System.out.println("C");
		} else if (m >= 80 && m <= 89) {
			System.out.println("B");
		} else if (m >= 90 && m <= 100) {
			System.out.println("A");
		}
	}

}
