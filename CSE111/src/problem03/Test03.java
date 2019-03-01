package problem03;

public class Test03 {
	
	public static void main(String [] args){
	    
		int x = 0;
	    int [] y = {20};
	    
	    B b1 = new B();    
	    System.out.println("In the main method "+x);
	    B b2 = new B();    
	    System.out.println("In the main method "+x);
	    B b3 = new B(x);    
	    System.out.println("In the main method "+x);
	    B b4 = new B(x);    
	    System.out.println("In the main method "+x);
	    B b5 = new B(y);    
	    System.out.println("In the main method "+y[0]);
	    B b6 = new B(y);    
	    System.out.println("In the main method "+y[0]);  
	}

}
