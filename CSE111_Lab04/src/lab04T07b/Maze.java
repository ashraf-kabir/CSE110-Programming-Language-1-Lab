package lab04T07b;

public class Maze {
	
	static int x;
	void methodA(){
		int m;
		x=5;
		m=x+methodB(x);
		System.out.println(x+" "+m);
		m=methodB(m-3)+x;
		System.out.println(x+" "+(m));
		methodB(x,m);
		System.out.println(x+" "+m+x);
	}
	int methodB(int y){
		x=y*y;
		System.out.println(x+" "+y);
		return x+3;
	}
	void methodB(int z, int x){
		z=z-2;
		x=x*1;
		System.out.println(z+" "+x);
	}

}
