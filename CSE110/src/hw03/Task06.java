package hw03;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter value: ");
		int S = sc.nextInt();

		if (S<100) {
			int L = 3000-125*(S*S);
			System.out.println(L);
		} else if (S>=100) {
			int L = 1200/4+(S*S/14900);
			System.out.println(L);
		}
	}

}
