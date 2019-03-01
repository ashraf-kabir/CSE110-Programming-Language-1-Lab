package task03;

import java.util.Scanner;

public class Task03 {
	
	public static int method(int []array, int a) {
	    
		int count=0;
		
		for(int i=0; i<array.length; i++){
			if(array[i]<0){
				array[i] = 0;
				count++;	
			}
		}
		return array.length-count;	
	}
	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array length: ");
		int length=sc.nextInt();
		
		int []array = new int[length];
		
		for(int i=0; i<array.length; i++){
			System.out.println("Enter number: ");
			int x = sc.nextInt();
			array[i]=x; 
		}
		System.out.println("Without negative number the new array size is: "+method(array,array.length));  
	}

}
