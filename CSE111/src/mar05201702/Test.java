package mar05201702;

public class Test {

	public static void main(String[] args) {
		
		A a = new A();
		B b = new B();
		
		a.x = 999;
		a.mA();
		b.mA();
		
		System.out.println(a.x);
		System.out.println(b.x);
		System.out.println(b.y);
	}

}
