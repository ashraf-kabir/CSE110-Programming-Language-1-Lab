package sep262016;

public class Prog {

	public static void main(String[] args) {
		
		Student s = new Student();
		
		s.setAge(-1000);
		int box = s.getAge();
		
		System.out.println(box);
	}

}
