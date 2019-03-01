package mar05201702;

public class B extends A {
	
	int y = 1000;
	
	public B(){
		System.out.println("In const of B");
	}
	
	public void mB(){
		System.out.println(x);
		System.out.println(y);
	}

}
