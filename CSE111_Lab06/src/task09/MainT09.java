package task09;

import java.util.Scanner;

public class MainT09{
	
	public static void main(String[] args){
    
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String a=sc.nextLine();
		Task09 t= new Task09(a);
		System.out.println(t.toUpperCase());  
	}

}