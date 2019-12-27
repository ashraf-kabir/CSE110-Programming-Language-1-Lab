package Practices.linearArray;

import java.util.Scanner;

public class LRightRotate {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int []arr=new int[5];
		
		for (int i=0; i<arr.length; i++){
			System.out.println("Enter number: ");
			arr[i]=sc.nextInt();
		}
		
		int temp=arr[arr.length-1];
		for (int i=arr.length-1; i>0; i--){
			arr[i]=arr[i-1];
		}
		arr[0]=temp;
		
		for (int j=0; j<arr.length; j++){
			System.out.print(arr[j]+" ");
		}
		System.out.println();
	}

}
