package task06;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Input a word:");
		String str1=sc.nextLine();
		
		String str2="==THE END==";
		
		System.out.println(str1);
		System.out.println(str1.concat("==THE END=="));
		System.out.println(str1);
	}

}
