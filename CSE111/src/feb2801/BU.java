package feb2801;

public class BU {

	public static void main(String[] args) {
		
		Student bba = new Student();
		Student eee = new Student();
		Student cse = new Student();
		
		bba.dept = "BBA department";
		eee.dept = "EEE department";
		cse.dept = "CSE department";
		
		bba.setName("BBA Student");
		eee.setName("EEE Student");
		cse.setName("CSE Student");
		
		bba.setId("12345");
		eee.setId("34567");
		cse.setId("45678");
		
		System.out.println(bba.getName());
		System.out.println(bba.getId());
		bba.printActivity();
		
		System.out.println(eee.getName());
		System.out.println(eee.getId());
		eee.printActivity();
		
		System.out.println(cse.getName());
		System.out.println(cse.getId());
		cse.printActivity();
	}

}
