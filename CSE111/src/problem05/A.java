package problem05;

public class A {
	
	public static int temp = 1;
	public int sum = 1;
	public int y = 1;
	public A(){
		y = temp - 1;
		sum = temp + 1;
		temp-= 1;
	}
	public void methodA(int m, int n){
		int x = 1;
		y = y + m + (temp++);
		x = x + 1 + n;
		sum = sum + x + y;
		System.out.println(x + " " + y+ " " + sum);	
	}

}
