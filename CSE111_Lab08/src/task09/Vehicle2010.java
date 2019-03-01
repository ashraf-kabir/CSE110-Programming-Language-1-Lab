package task09;

public class Vehicle2010 {
	
	private int x;
	private int y;
	
	public Vehicle2010(){
		x=0;
		y=0;
	}
	public void moveUp(){
		y++;
	}
	public void moveDown(){
		y--;
	}
	public void moveRight(){
		x++;
	}
	public void moveLeft(){
		x--;
	}
	
	public void moveUpperRight(){
		moveUp();
	    moveRight();
	}
	public void moveUpperLeft(){
	    moveUp();
	    moveLeft(); 
	}
	public void moveLowerLeft(){
	    moveDown();
	    moveLeft(); 
	}
	public void moveLowerRight(){
	    moveUp();
	    moveRight(); 
	}
	public String toString(){
	    return "("+x+", "+y+")";  
	}
	
	public boolean equals(Vehicle2010 a){
		if(x==a.x && y==a.y){
			return true;
		}
		return false;
	}

}
