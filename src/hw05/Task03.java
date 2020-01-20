package hw05;

public class Task03 {

	public static void main(String[] args) {

		int[] a = new int[] { 10, 30, 20, 50, 40 };

		int max = a[0];
		int maxLoc = 0;

		for (int b = 0; b < a.length; b++) {
			if (a[b] > max) {
				max = a[b];
				maxLoc = b;
			}
		}
		System.out.println("Largest number is " + max);
		System.out.println("Largest number was found at location " + maxLoc);
	}

}
