package task14;

public class FinalT6A{
	
	public int temp = 1;
	private int sum;  
	private int y = 2;
	
	public FinalT6A(int x, int p){
	    temp+=1;
	    y = temp - p;
	    sum = temp + x;
	    System.out.println(x + " " + y+ " " + sum); 
	}
	public void methodA(){
		int x=0, y =0;
		y = y + this.y;
	    x = this.y + 3 + temp;
	    sum = x + y + methodB(temp, y);
	    System.out.println(x + " " + y+ " " + sum); 
	}
	public int methodB(int temp, int n){
	    int x = 0;
	    y = y + (++temp);
	    x = x + 4 +  n;
	    sum = sum + x + y;
	    System.out.println(x + " " + y+ " " + sum);  
	    return sum;	  
	}	

}
