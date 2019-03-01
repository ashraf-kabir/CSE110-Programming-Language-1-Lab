package task01;

public class Trim {
	
	public static char [] trim(char [] input){
		int l = input.length;
		for(int i=0; i<input.length; i++){
			if(input[i]==' ' && input[i-1]==' '){
				l-=1;
			}
		}
		char []output = new char[l];
		int m=--l;
		for(int i=0; i<input.length; i++){
			if(input[i]==' ' && input[i-1]== ' '){
				continue;
			}
			else if(l<0){
				break;
			}
			else{
				output[m-l] = input[i];
				l-=1;
			}
		}
		return output;
	}
	
	public static void main(String[] args) {
		char [] input = {'T','h','i','s',' ',' ',' ',' ',' ','i','s',' ',' ',' ',' ','a',' ',' ',' ',' ','t','e','s','t','.'};
		for (int i = 0; i< input.length; i++){
			System.out.print(input[i]);
		}
		System.out.println("");
		char []  output = trim(input);
		for(int i=0; i<output.length; i++){
			System.out.print(output[i]);
		}
		System.out.println(""); 
	}

}
