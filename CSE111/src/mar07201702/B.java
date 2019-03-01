package mar07201702;

public class B extends A {
	
	public int x = 1000;
	
	public void m(){
		super.m();                          //goes up and call parent method m()
		System.out.println(x);
	}

}
