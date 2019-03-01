package labMidSection05SetBQ02;

public class A {
	
	public static int temp = 4;
	public int sum;
	public int y;
	public A(){
		y = temp - 2;
		sum = temp + 3;
		temp=temp++;
	}
	public void methodA(int m, int n){
		int x = 0;
		y = y + m + (temp++);
		x = x + 2 + n;
		sum = sum + x + y;
		System.out.println(x + " " + y+ " " + sum);	
	}

}
