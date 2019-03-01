package problem05;

public class Main {

	public static void main(String[] args) {
		
		A a1 = new A();
		B b1 = new B();
		B b2 = new B(b1);
		a1.methodA(1, 1);
		b1.methodA(1, 2);
		b2.methodA(3, 2);
	}

}
