package hw05;

/**
 * Task2) Assume that we have the following array contains marks.
 * int[] marks = new int[] {10, 30, 20, 50, 40};
 * Find how many students are better than average.
 * Output:
 * 2 students are better than average.
 * They received following marks
 * 50
 * 40
 * <p>
 * Hint: First calculate average marks. Then loop through the marks
 * array and count how many marks are greater than average.
 * Print this count. Then again, loop through the marks and count
 * how many elements were greater than average marks.
 */

public class Task02 {

	public static void main(String[] args) {

		int[] n = new int[]{10, 30, 20, 50, 40};

		int sum = 0;
		for (int i = 0; i < n.length; i++) {
			sum += n[i];
		}
		double avg = sum / n.length;

		int count = 0;
		for (int i = 0; i < n.length; i++) {
			if (n[i] > avg) {
				count++;
			}
		}
		System.out.println(count + " students are better than average.");

		System.out.print("They received following marks: ");
		for (int i = 0; i < n.length; i++) {
			if (n[i] > avg) {
				System.out.print(n[i] + " ");
			}
		}

	}

}
