package hw04;

import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number: ");
		int r = sc.nextInt();

		int sum = 0;
		int count = 0;

		for (int c = 1; c <= r; c++) {
			count++;
			sum += c;
		}
		System.out.println(sum);

	}

}
