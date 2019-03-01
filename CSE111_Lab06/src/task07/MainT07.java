package task07;

import java.util.Scanner;

public class MainT07{
  
	public static void main(String[] args){
    
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter word");
		String a=sc.nextLine();
		System.out.println("Enter which character is to be replaced");
		String oldChar = sc.nextLine();
		System.out.println("Enter which character is to be there after replacing");
		String newChar=sc.nextLine();
		Task07 t=new Task07(a);
		System.out.println(t.replaceLast(oldChar,newChar));
	}

}
