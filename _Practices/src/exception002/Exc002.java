package exception002;

public class Exc002 {

	public static void main(String[] args) {
		int d,a;
		
		try {
			d=0;
			a=35/d;
			System.out.println(a);
			System.out.println("This will not be printed");
		} catch (ArithmeticException e) {
			System.out.println("Division by zero");
		}
		
		System.out.println("After catch statement");
	}

}
