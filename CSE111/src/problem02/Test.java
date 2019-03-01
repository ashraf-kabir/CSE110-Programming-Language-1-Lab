package problem02;

public class Test{
	
	public static void main(String [] args){
	    
		A a1 = new A();
		System.out.println("In the main method "+a1);
		A a2 = new A(a1);
		System.out.println("In the main method "+a2);
		A a3 = new A(a2);
		System.out.println("In the main method "+a3);
		A a4 = new A(a3);
		System.out.println("In the main method "+a4);
		A a5 = new A(a4);
	  }

}
