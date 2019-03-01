package task21;

public class Car {
	
	private static int ObjectCount=0;
    private int year;
    
    public Car(int y){
        year = y;
        ObjectCount++;
    }
    public int getYear(){
        return year;
    }
    public static int getObjectCount(){
        return ObjectCount;
    }

}
