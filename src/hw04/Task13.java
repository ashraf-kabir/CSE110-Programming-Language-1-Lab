package hw04;

import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number: ");
		int N = sc.nextInt();

		int sum = 0;

		for (int i = 1; i <= N; i++) {
			if (i % 2 != 0) {
				sum += i;
			}
		}
		System.out.println(sum);

	}

}
