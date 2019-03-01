package hw03;

import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your favourite car's name: ");
		String x = sc.nextLine();

		for (int c=1; c<=4; c++) {
			System.out.println(x);
		}
	}

}
