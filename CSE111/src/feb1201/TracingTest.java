package feb1201;

public class TracingTest {

	public static void main(String[] args) {
		
		Scope obj01 = new Scope();
		
		obj01.m1();
		obj01.m2();
		obj01.m1();
		obj01.m2();
	}

}
