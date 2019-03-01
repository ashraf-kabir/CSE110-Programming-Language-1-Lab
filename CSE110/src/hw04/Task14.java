package hw04;

import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int count = 0;
		int prod = 1;

		System.out.println("Enter range: ");
		int r = sc.nextInt();

		for (int a = 1; a <= r; a++) {
			count++;
			prod = prod * count;
		}
		System.out.println(prod);
	}

}
