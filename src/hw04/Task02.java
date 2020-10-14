package hw04;

/**
 * Task 2:
 * Write javacode to display all the odd numbers between 10 and 50.
 */

public class Task02 {

	public static void main(String[] args) {

		System.out.println("The odd numbers are: ");
		for (int i = 10; i <= 50; i++) {
			if (i % 2 != 0) {
				System.out.print(i + ", ");
			}
		}
	}

}
