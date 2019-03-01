package lab04T07;

public class PuzzleTester {
	
	public static void main(String[]args) {
		
		Puzzle p = new Puzzle();
		p.methodA();
		p.methodA();
		p = new Puzzle();
		p.methodA();
		p.methodB(7);
	}
	
}
