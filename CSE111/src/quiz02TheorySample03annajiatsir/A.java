package quiz02TheorySample03annajiatsir;

class A{
	
	public int temp = 1;
	public int x = 3;
	public int sum = 1;
	public int y = 1;
	public A(){
		
		y = temp - 1;
		sum = temp + 1;
		temp-= 1;	
	}
	
	public A(A a){
		sum = a.sum + sum;
		a.x = a.x + sum;	
	}
	
	public void methodA(int m, int n){
		int x = 1;
		y = y + m + (temp++);
		x = x + 1 + n;
		sum = sum + x + y;
		System.out.println(x + " " + y+ " " + sum);	
	}
	
	public void methodB(int m, int n){
		int y = 1, temp = 1;
		y = y + m + temp;
		x = y + 1 + temp - n;
		methodA(x, y);
		sum = x + y + sum;
		System.out.println(x + " " + y+ " " + sum);
	}

}
