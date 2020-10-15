package lab08;

/**
 * Task 1
 * Write a java program that would input three numbers from the user and print sum, then the first number,
 * then the 2nd number followed by 3rd number. If user enters 10, 20, 30. Then output should be 60, 10, 20, and 30.
 */

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] num = new int[3];
		int sum = 0;

		for (int a = 0; a < num.length; a++) {
			System.out.println("Enter number:");
			num[a] = sc.nextInt();
			sum += num[a];
		}
		System.out.println(sum);

		String str = "";
		for (int b = 0; b < num.length; b++) {
			str += num[b] + ", ";
		}
		System.out.print(str.substring(0, str.length()-2));
	}

}
