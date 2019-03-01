package hw04;

import java.util.Scanner;

public class Task21 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number: ");
		int num = sc.nextInt();

		int digitC = 0;

		for (int temp = num; temp > 0; temp /= 10) {
			digitC++;
		}

		double prod = Math.pow(10, digitC - 1);

		for (; prod > 0; prod /= 10) {
			int m = num / (int) prod;
			num %= (int) prod;
			System.out.println(m);
		}
	}

}
