package hw05;

public class Task02 {

	public static void main(String[] args) {

		int[] n = new int[] { 10, 30, 20, 50, 40 };

		int sum = 0;
		for (int a = 0; a < n.length; a++) {
			sum += n[a];
		}
		int avg = sum / n.length;

		int count = 0;
		for (int b = 0; b < n.length; b++) {
			if (n[b] > avg) {
				count++;
			}
		}
		System.out.println(count + " students are better than average.");

		System.out.println("They received following marks");
		for (int d = 0; d < n.length; d++) {
			if (n[d] > avg) {
				System.out.println(n[d]);
			}
		}
	}

}
