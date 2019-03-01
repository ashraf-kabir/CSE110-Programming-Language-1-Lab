package quiz02TheorySample03annajiatsir;

public class Q02sample03 {
	
	public static void main(String[] args) {
		
		A a1 = new A();
		A a2 = new A(a1);
		a1.methodA(1, 1);
		a1.methodB(1, 2);
		a2.methodB(3, 2);
		
	}

}
