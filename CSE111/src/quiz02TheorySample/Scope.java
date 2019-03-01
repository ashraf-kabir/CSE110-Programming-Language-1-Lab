package quiz02TheorySample;

public class Scope{
	
	public int p1 = 1;
	public int p2 = 2;
	public Scope(int x, int y){
		p1 = p1 + x;
	    y = y + x;
	    x = x + 1;
	    p2 = p2 + x + y;    
	}
	public void m1(){
	    int z = 20;
	    z++;
	    p1++;
	    System.out.println(p2 + z);
	    p1 = ++p2 + z;  
	}
	public void m2(int x){
		p1 = p1 + 1;
	    x = x + p2;
	    System.out.println(x);
	    x++;
	}
	public int m3(){
		System.out.println(p1);
	    p1++;    
	    return p1 + p2;    
	}

}
