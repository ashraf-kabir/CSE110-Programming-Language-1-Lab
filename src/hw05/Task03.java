package hw05;

/**
 * Task3) Assume that we have the following array.
 * int[] a = new int[] {10, 30, 20, 50, 40};
 * Find the largest number and print it along with its location.
 * Output:
 * Largest number is 50
 * Largest number was found at location 3
 */

public class Task03 {

	public static void main(String[] args) {

		int[] arr = new int[] { 10, 30, 20, 50, 40 };

		int max = arr[0];
		int maxLoc = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				maxLoc = i;
			}
		}
		System.out.println("Largest number is " + max);
		System.out.println("Largest number was found at location " + maxLoc);
	}

}
