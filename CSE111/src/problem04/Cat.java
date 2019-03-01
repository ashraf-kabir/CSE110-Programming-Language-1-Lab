package problem04;

public class Cat {
	
	public String color = "White";
	public String action = "sitting";
	
	public Cat(){
		
	}
	
	public Cat(String p){
		color = p;
	}
	
	public Cat(String x, String y){
		color = x;
		action = y;
	}
	
	public void changeColor(String z){
		color = z;
	}
	public void printCat(){
		System.out.println(color+" cat is "+action);
	}

}
