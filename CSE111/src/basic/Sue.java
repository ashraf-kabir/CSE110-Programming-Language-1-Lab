package basic;

public class Sue {
	
	void method1() {
		System.out.println("sue 1");
	}

	void method3() {
		method1();
		System.out.println("sue 3");
		method1();
	}


}
