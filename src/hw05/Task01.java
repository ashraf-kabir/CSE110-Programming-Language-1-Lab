package hw05;

/**
 * Task1) Assume that we have the following array contains
 * marks of 5 students.
 * int[] marks = new int[] {10, 30, 20, 50, 40};
 * Find the max, min, average mark.
 * Output:
 * Highest mark is 50
 * Lowest mark is 10
 * Average mark is 30
 */

public class Task01 {

	public static void main(String[] args) {

		int[] marks = new int[] { 10, 30, 20, 50, 40 };

		int max = marks[0];
		int min = marks[0];
		int sum = 0;
		double avg = 0;

		for (int i = 0; i < marks.length; i++) {
			if (marks[i] > max) {
				max = marks[i];
			}
		}

		for (int i = 0; i < marks.length; i++) {
			if (marks[i] < min) {
				min = marks[i];
			}
		}

		for (int i = 0; i < marks.length; i++) {
			sum += marks[i];
		}

		avg = sum / marks.length;

		System.out.println("Highest mark is " + max);
		System.out.println("Lowest mark is " + min);
		System.out.println("Average mark is " + avg);
	}

}
