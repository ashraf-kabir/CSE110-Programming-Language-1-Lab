package task06;

import java.util.*;

public class Task06Main {
	
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);    
		
		System.out.println("Enter word");
		String a=sc.nextLine();
		    
		System.out.println("Enter which character is to be replaced");
		String oldChar = sc.nextLine();
		
		System.out.println("Enter which character is to be there after replacing");
		String newChar=sc.nextLine();
		
		Task06 t=new Task06(a);
		System.out.println(t.replaceAll(oldChar,newChar));
	}
		
}
