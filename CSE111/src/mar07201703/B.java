package mar07201703;

public class B extends A{
	
	//public int x = 1000;
	
	public B(){
		//super(9);
		System.out.println("In const of Old B");
	}
	public B(int x){
		super(9);
		System.out.println("In const of New B");
	}

}
