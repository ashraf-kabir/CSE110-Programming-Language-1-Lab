package hw04;

/**
 * Task 19:
 * Write javacode of a program which takes a number and prints the value of 10 to the power that number.
 * You need to use loop because variable in the power isn't allowed.
 * For example: if user gives 3, print 1000.
 * Hint: Keep multiplying 1 by 10, again and again, 3 (or n) times
 * like sum=sum+n, you need to write, product = product x 10
 * 1 x 10 = 10
 * 10 x 10 = 100
 * 100 x 10 = 1000
 */

import java.util.Scanner;

public class Task19 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number:");
		int num = sc.nextInt();

		double b = Math.pow(10, num);

		System.out.println(b);
	}

}
