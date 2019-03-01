package linearArray;

import java.util.Scanner;

public class LLeftShift {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int []arr=new int[5];
		
		for (int i=0; i<arr.length; i++){
			System.out.println("Enter number: ");
			arr[i]=sc.nextInt();
		}
		
		for (int i=1; i<arr.length; i++){
			arr[i-1]=arr[i];
		}
		arr[arr.length-1]=0;
		
		for (int j=0; j<arr.length; j++){
			System.out.print(arr[j]+" ");
		}
		System.out.println();
	}

}
