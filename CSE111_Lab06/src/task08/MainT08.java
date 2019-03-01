package task08;

import java.util.Scanner;

public class MainT08 {
	
	public static void main(String[] args){
	    
		Scanner sc=new Scanner(System.in);
	    
		System.out.println("Enter a string: ");
	    String a=sc.nextLine();
	    Task08 t= new Task08(a);
	    
	    System.out.println(t.toLowerCase());
	}

}
