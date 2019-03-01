package hw04;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number:");
		int n = sc.nextInt();

		int max = n;
		int sum = n;

		for (int c = 1; c <= 19; c++) {
			System.out.println("Enter number:");
			int m = sc.nextInt();
			if (m > max) {
				max = m;
			}
			sum += m;
		}
		double avg = sum / 20.0;
		System.out.println(avg);

	}

}
