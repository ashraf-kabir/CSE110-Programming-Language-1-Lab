package poly002;

public class Frodo extends Bilbo {
	
	public String name = "Frodo";
	
	public void method1(){
		System.out.println(super.name+" 1");
		System.out.println("Frodo 1");
		super.method1();
	}
	public void method3(){
		System.out.println(this.name+" 3");
		System.out.println("Frodo 3");
	}

}
