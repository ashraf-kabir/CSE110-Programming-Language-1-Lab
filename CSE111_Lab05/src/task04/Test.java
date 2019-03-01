package task04;

public class Test {
	
	public static int [] removeOdd (int [] input){
		int l = input.length;
		for(int i=0; i<input.length; i++){
			if(input[i]%2!=0){
	        l-=1;
			}
		}
		int []output = new int[l];
	    int m=--l;
	    for(int i =0; i<input.length; i++){
	    	if(input[i]%2!=0){
	    		continue;
	    	}
	    	else if(l<0){
	    		break;
	    	}
	    	else{
	    		output[m-l]=input[i];
	    		l-=1;
	    	}
	    }
	    return output;  
	}
	
	public static void main(String [] args){
		int [] mixedArray = {21, 33, 44, 66, 11, 1, 88, 45, 10, 9};
		for (int i=0; i<mixedArray.length; i++) {
			System.out.print(mixedArray[i] + " ");	  
		}
		System.out.println();
		int [] noOdd = removeOdd(mixedArray);
		for(int i=0; i<noOdd.length; i++){
			System.out.print(noOdd[i]+" ");
		}
	}

}
