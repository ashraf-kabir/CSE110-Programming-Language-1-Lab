package apr022017;

public class Test {

	public static void main(String[] args) {
		
		Cat a = new Cat();
		//a.makeSound();
		
		Harley h = new Harley();
		h.makeSound();
		
		Mp3 m = new Mp3();
		//m.makeSound();
		//Dog b = new Dog();
		//b.makeSound();
		
		SoundMaker.printSound(a);
		SoundMaker.printSound(m);
	}

}
