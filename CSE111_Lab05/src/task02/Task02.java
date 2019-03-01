package task02;

import java.util.Scanner;

public class Task02 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		
		int [] arr = new int[26];
		int max=0, max2=0;
		
		for(int i=0; i<str.length(); i++){
			int a = (int) str.charAt(i);
			if(a>=65 && a<=90){
				arr[a-65]++;
			}
		}
		for(int i=0; i<26; i++){
			if(arr[i]>max){
				max=arr[i];
			}
			else if(arr[i] <max && arr[i]>max2){
				max2=arr[i];
			}
		}
		
		for(int i=0; i<26; i++){
			if(arr[i]==max2 && arr[i]!=0){
				System.out.println(str+" had "+ (char) (i+65)+" second most "+ (int) max2);
			}
			else{
				System.out.println("There is no second most character.");
				break;
			}
		}
	}

}
