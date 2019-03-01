package task19;

public class B extends A {
	
	public static int x;
	
	public B(){
		y = temp + 3 ;
	    sum = 3 + temp + 2;
	    temp-=2;
	}
	public B(B b){
	    sum = b.sum;
	    x = b.x;
	    b.methodB(2,3); 
	}
	public void methodB(int m, int n){    
	    int  y = 0;
	    y = y + this.y;
	    x = this.y + 2 + temp;
	    methodA(x, y);
	    sum = x + y + sum;
	    System.out.println(x + " " + y+ " " + sum);
	}

}
