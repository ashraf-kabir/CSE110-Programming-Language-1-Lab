package task03;

public class A {
	
	public int temp = 4;
	public int sum;
	public int y;
	
	public A(){
	    y = temp - 2;
	    sum = temp + 3;
	    temp-=2; 
	}
	public void methodA(int m, int n){
	    int x = 0;
	    y = y + m + (temp++);
	    x = x + 2 +  n;
	    sum = sum + x + y;
	    System.out.println(x + " " + y+ " " + sum);
	}

}
