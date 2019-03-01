package interfaceHandout;

public class Dog extends Animal implements SoundSource {
	
	public Dog(String s){
	    super(s);
	}
	public void makeSound(){
		System.out.println(getName()+ " is barking.");  
	}

}
