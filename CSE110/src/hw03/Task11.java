package hw03;

import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter quiz mark: ");
		int mark = sc.nextInt();
		System.out.println("Enter current scale: ");
		int currentScale = sc.nextInt();
		System.out.println("Enter target scale: ");
		int targetScale = sc.nextInt();
		
		int x = (mark*targetScale)/currentScale;
		
		System.out.println(x);
	}

}
