package task04;

import java.util.Scanner;

public class Task04 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a UPPERCASE lettered name:");
		String str = sc.nextLine();
		
		int[] n= new int[26];
		
		for(int a=0; a<str.length(); a++){
			int p=str.codePointAt(a);
			int q=p-65;
			n[q]++;
		}
		for(int b=0; b<26; b++){
			int r = b+65;
			char z = (char)r;    //typecasting
			System.out.printf(z+" which is "+r+" was found "+n[b]+" time(s)"+"\n");
		}
	}
	
}
