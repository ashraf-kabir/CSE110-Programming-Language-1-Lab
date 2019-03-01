package feb2801;

public class Student {
	
	public String name;
	public String id;
	public String dist;
	public String dept;
	
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
	public void setDist(String dist){
		this.dist=dist;
	}
	public String getDist(){
		return dist;
	}
	public void printActivity(){
		if(dept == "BBA department"){
			System.out.println("Party");
		}
		if(dept == "EEE department"){
			System.out.println("Study");
		}
		if(dept == "CSE department"){
			System.out.println("Cry");
		}
	}

}
