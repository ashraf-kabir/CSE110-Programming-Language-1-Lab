package lab04T06;
/*
 *  What is the output for the following code sequence?
 * FinalT3A fT3A = new FinalT3A();
 * fT3A.methodA();
 * fT3A.methodB(6,8);
 */

public class Task06{
	public int sum;
	public int y;
	
	public void methodA(){
		int x=0, y=0, j=0;
		while (j < 2){
			y = y + j;
			x = j + methodB(y , j);
			sum = x + y;
			System.out.println(x + " " + y+ " " + sum);
			j++;
		}
	}
	
	public int methodB(int p, int k){
		int x = 0;
		y = y + k + 1;
		x = x + 3 - p;
		sum = sum + x + y;
		System.out.println(x + " " + y+ " " + sum);
		return sum;	
	}
}
