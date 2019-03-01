package task10;

public class Test {

	public static void main(String[] args) {
		
		Student john = new Student("John Abc", "098", "123 street", 3.77);
		Student mike = new Student("Mike Ijk", "987", "456 street", 3.66);
		Student carol = new Student("Carol Pqr", "765", "789 street", 3.55);
		
		//john.setName("John abc");
		//john.setID("123456");
		//john.setAddress("123 street");
		//john.setCGPA(3.77);
		
		//mike.setName("Mike pqr");
		//mike.setID("987654");
		//mike.setAddress("456 street");
		//mike.setCGPA(3.44);
		
		//carol.setName("Carol ijk");
		//carol.setID("147258");
		//carol.setAddress("789 street");
		//carol.setCGPA(3.55);
		
		System.out.printf("Student 01: "+"\n"+"Name: "+john.name+" ID: "+john.id+" Address: "+john.address+" CGPA: "+john.cgpa+"\n");
		System.out.printf("\n"+"Student 02: "+"\n"+"Name: "+mike.name+" ID: "+mike.id+" Address: "+mike.address+" CGPA: "+mike.cgpa+"\n");
		System.out.printf("\n"+"Student 03: "+"\n"+"Name: "+carol.name+" ID: "+carol.id+" Address: "+carol.address+" CGPA: "+carol.cgpa+"\n");
	}

}
