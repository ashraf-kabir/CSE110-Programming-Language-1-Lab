package task05;

public class Task05 {
	
	public int temp = 4;
	private int sum;
	private int y = 1;
	
	public Task05(int x, int p){
		temp+=1;
		y = temp - p;
		sum = temp + x;
		System.out.println(x + " " + y+ " " + sum);
	}
	public void methodA(){
		int x=0, y =0;
		y = y + this.y;
		x = this.y + 2 + temp;
		sum = x + y + methodB(temp, y);
		System.out.println(x + " " + y+ " " + sum);
	}
	public int methodB(int temp, int n){
		int x = 0;
		y = y + (++temp);
		x = x + 3 + n;
		sum = sum + x + y;
		System.out.println(x + " " + y+ " " + sum);
		return sum;
	}

}
