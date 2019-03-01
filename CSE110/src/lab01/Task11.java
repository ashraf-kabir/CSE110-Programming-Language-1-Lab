package lab01;

import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int sum = 0;

		for (int a = 1; a <= 5; a++) {
			System.out.println("Enter number:");
			int num = sc.nextInt();
			sum += num;
		}

		double avg = sum / 5.0;

		System.out.println("The average of inputted five numbers is =" + avg);

	}

}
