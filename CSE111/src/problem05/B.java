package problem05;

public class B extends A {
	
	public static int x = 1;
	public int temp = 20;
	public int sum = 10;
	
	public B(){
		y = super.temp + 1 ;
		x = 1 + temp + x;
		temp -= 1;
	}
	public B(B b){
		sum = b.sum + super.sum + this.temp;
		b.x = b.x + sum + super.temp;
	}
	public void methodA(int m, int n){
		int y = 1, temp = 1;
		y = y + this.y + m;
		x = y + 1 + this.temp - n + temp;
		super.methodA(x, y);
		sum = x + y + this.sum;
		System.out.println(x + " " + y+ " " + sum);
	}

}