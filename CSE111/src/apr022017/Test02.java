package apr022017;

public class Test02 {

	public static void main(String[] args) {
		
		Dog d = new Dog();   
	    Animal a = new Dog();
	    
	    System.out.println(d.sound);
	    System.out.println(a.sound);
	    a.makeSound();
	}

}
