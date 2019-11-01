package hw04;

import java.util.Scanner;

public class Task19 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number: ");
		int num = sc.nextInt();

		double b = Math.pow(10, num);

		System.out.println(b);
	}

}
