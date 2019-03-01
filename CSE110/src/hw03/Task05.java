package hw03;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter seconds: ");
		int s = sc.nextInt();

		int hrs = s/3600;
		int remS = s%3600;
		int mins = remS/60;
		int Sec = remS%60;

		System.out.println(hrs + " hour(s)" + mins + " minute(s)+" + Sec + " second(s)");
	}

}
