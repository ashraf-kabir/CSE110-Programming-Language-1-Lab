package lab03;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int n = sc.nextInt();

		if (n % 2 == 0 && n % 5 == 0) {
			System.out.println("Your number is multiple by 2 & 5 both.");
		} else if (n % 2 == 0) {
			System.out.println(n);
		} else if (n % 5 == 0) {
			System.out.println(n);
		} else {
			System.out.println("Not multiple of 2 or 5");
		}
	}

}
