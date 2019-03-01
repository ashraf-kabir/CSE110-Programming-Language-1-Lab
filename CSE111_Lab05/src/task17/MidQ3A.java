package task17;

public class MidQ3A{
	
	public int sum;
	public int y;
	
	public void methodA(){
		int x=0, y =0, k = 0;
		int [] msg = new int[1];
		msg[0] = 5;
		while (k < 2){
			y = y + msg[0];
			x = y + methodB(msg, k);
			sum = x + y + msg[0];
			System.out.println(x + " " + y+ " " + sum);
			k++;
		}
	}

	private int methodB(int [] mg2, int mg1){
		int x = 0;
		y = y + mg2[0];
		x = x + 3 + mg1;
		sum = sum + x + y;
		mg2[0] = y + mg1;
		mg1 = mg1 + x + 2;
		System.out.println(x + " " + y+ " " + sum);
		return mg1;
	}

}