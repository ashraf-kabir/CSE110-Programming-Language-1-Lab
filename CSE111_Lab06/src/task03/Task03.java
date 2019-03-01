package task03;

import java.util.Scanner;

public class Task03 {
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string");
		String str1 = sc.nextLine();
		System.out.println("Enter another string");
		String str2 = sc.nextLine();
		
		char [] ch1 = str1.toCharArray();
		char [] ch2 = str2.toCharArray();
		
		if(ch2.length>ch1.length){
			System.out.println("false");
		}
		else{
			int flag = 0;
			for(int i=0; i<ch2.length; i++){
				if(ch1[i]!=ch2[i]){
					flag = 1;
					System.out.println("false");
					break;
				}
			}
			if(flag==0){
				System.out.println("true");
			}
		}
	}

}
