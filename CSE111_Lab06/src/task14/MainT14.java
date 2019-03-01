package task14;

import java.util.Scanner;

public class MainT14{
  
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter First Word");
		String a=sc.nextLine();
		System.out.println("Enter Sub string starting number");
		int b=sc.nextInt();
		
		Task14 t=new Task14(a);
		System.out.println(t.substring(b));
	}

}
