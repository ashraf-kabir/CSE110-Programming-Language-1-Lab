package feb2802;

public class BBAStudent {
	
	public String name;
	public String id;
	public String dist;
	
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setId(String id){
		this.id=id;
	}
	public String getId(){
		return id;
	}
	public void printCGPA(){
		System.out.println("BBA Student will get "+ 4.0);
	}
	public void activity(){
		System.out.println("Party\n");
	}

}
