package task07;

public class MainT07 {
	
	public static void main(String[] args){
		
		Quiz3A a1 = new Quiz3A();
		a1.methodB(1,2);
		Quiz3A a2 = new Quiz3A(3);
		a2.methodB(2,4);
		a1.methodB(2,1);
		a2.methodB(1,3);
	}

}
