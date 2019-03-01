package mar05201701;

public class BU {
	
	public static void main(String[] args) {
		
		BBAStudent bba = new BBAStudent();
		EEEStudent eee = new EEEStudent();
		CSEStudent cse = new CSEStudent();
		
		bba.setName("BBA Student 01");
		eee.setName("EEE Student 01");
		cse.setName("CSE Student 01");
		
		bba.setId("12345");
		eee.setId("56748");
		cse.setId("09876");
		
		System.out.println(bba.getName()+" id: "+bba.getId());
		bba.printCGPA();
		bba.activity();
		
		System.out.println(eee.getName()+" id: "+eee.getId());
		eee.printCGPA();
		eee.activity();
		
		System.out.println(cse.getName()+" id: "+cse.getId());
		cse.printCGPA();
		cse.activity();
	}

}
