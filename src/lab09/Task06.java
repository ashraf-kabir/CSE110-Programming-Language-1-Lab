package lab09;

/**
 * Task 6
 * Write a program which asks the user how many numbers to take. Then takes that many numbers and prints the median value.
 * Read http://www.mathsisfun.com/median.html
 * If the user gives 10, 50, 40, 20, 30. Then the median is 30 (because 30 falls in middle 10, 20, 30, 40, 50)
 * If the user gives 30, 10, 40, 20. Then the median is 25 because, (20+30)/2=25(average of two middle values from 10, 20, 30, 40)
 */

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please input how many number do you want to store: ");
		int r = sc.nextInt();

		int n[] = new int[r];

		int temp = 0;
		int median = 0;

		for (int a = 0; a < n.length; a++) {
			System.out.println("Enter number: ");
			n[a] = sc.nextInt();
		}

		for (int a = 0; a < n.length; a++) {
			for (int b = 0; b < n.length; b++) {
				if (n[a] > n[b]) {
					temp = n[a];
					n[a] = n[b];
					n[b] = temp;
				}
			}
		}

		if (r % 2 != 0) {
			median = r / 2;
			System.out.println("The median is = " + n[median]);
		}

		else {
			int d = r / 2;
			median = n[d] + n[d - 1];
			double med = median / 2.0;
			System.out.println("The median is = " + med);

		}

	}

}
