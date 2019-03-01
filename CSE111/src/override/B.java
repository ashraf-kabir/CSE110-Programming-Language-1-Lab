package override;

public class B extends A {
	
	int k;
	
	public B(int a, int b, int c){
	    super(a,b);
	    k = c;  
	}
	public void show(){                        //overrides super class A's method show
	    super.show();
	    System.out.println("Value of k: " + k );
	  
	}

}
