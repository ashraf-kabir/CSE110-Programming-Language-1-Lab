package feb1201;

public class Scope {
	
	public int x = 1;
	public int y = 100;
	
	public void m1(){
		int x = 10;
		x = x+1;
		System.out.println(x);
		System.out.println(y);
		y = y-10;
	}
	
	public void m2(){
		int y = 80;
		y = y+x;
		System.out.println(x);
		System.out.println(y);
		x = x-y;
	}

}
