package quiz02TheorySample;

public class SampleMain {

	public static void main(String[] args) {
		
		Scope s1 = new Scope(1, 2);
	    Scope s2 = new Scope(1, 1);
	    s1.m1();
	    int k = s2.m3();
	    s1.m2(k + 10);
	    s2.m2(34);
	    int j = s2.m3();
	    s2.m2(k + j);
	    s1.m1();
	    s2.m1();
	    System.out.println(s2.m3());
	}

}
