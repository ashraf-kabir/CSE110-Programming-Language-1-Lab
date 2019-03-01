package poly002;

public class Gandalf {
	
	public String name = "Gandalf";
	
	public void method1(){
		System.out.println("Gandalf 1");	
	}
	public void method2(){
		System.out.println("Gandalf 2");
		method1();
		System.out.println(name+" 2");	
	}

}
