package task01;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter range: ");
		int x = sc.nextInt();

		for (int b = 1; b <= x; b++) {
			System.out.print(b);
		}
		System.out.println();
	}

}
