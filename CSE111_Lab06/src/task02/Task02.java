package task02;

import java.util.Scanner;

public class Task02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		
		System.out.println("Enter value of index: ");
		int index = sc.nextInt();
		
		char [] ch = str.toCharArray();
		
		if(index>ch.length || index<0){
			System.out.println("Invalid index");
		}
		else {
			System.out.println(ch[index]);
		}
	}

}
