package quiz02TheorySample02;

public class Dog {
	
	private String color = "Black";
	
	public Dog(String name){
		color = name;
	}
	
	public void changeColor(String name){
		color = name;
	}
	
	public void bark(){
		System.out.println(color.concat(" dog is barking"));
	}

}
