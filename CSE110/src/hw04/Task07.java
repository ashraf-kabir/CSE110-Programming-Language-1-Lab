package hw04;

public class Task07 {

	public static void main(String[] args) {

		int sum = 0;
		for (int a = 1; a <= 600; a++) {
			if (a % 7 == 0) {
				if (a % 9 == 0) {
					sum += a;
				}
			}
		}
		System.out.println(sum);
	}

}
