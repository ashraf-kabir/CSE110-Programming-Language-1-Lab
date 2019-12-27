package hw04;

import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int sum = 0;

		for (int c = 1; c <= 20; c++) {
			System.out.println("Enter number: ");
			int num = sc.nextInt();
			sum += num;
			System.out.println(sum);
		}
	}

}
