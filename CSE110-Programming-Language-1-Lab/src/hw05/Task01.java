package hw05;

public class Task01 {

	public static void main(String[] args) {

		int[] marks = new int[] { 10, 30, 20, 50, 40 };

		int max = marks[0];
		int min = marks[0];
		int sum = 0;
		double avg = 0;

		for (int a = 0; a < marks.length; a++) {
			if (marks[a] > max) {
				max = marks[a];
			}
		}

		for (int a = 0; a < marks.length; a++) {
			if (marks[a] < min) {
				min = marks[a];
			}
		}
		for (int a = 0; a < marks.length; a++) {
			sum += marks[a];
		}
		System.out.println("Highest mark is " + max);
		System.out.println("Lowest mark is " + min);
		System.out.println("Average mark is " + sum / marks.length);
	}

}
