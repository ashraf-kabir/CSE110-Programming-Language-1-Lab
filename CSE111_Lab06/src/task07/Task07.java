package task07;

public class Task07{
	String a;
	Task07 (String a){
		this.a=a;
	}
	String replaceLast(String oldChar,String newChar){
	    
		char []c=a.toCharArray();
	    char []d=oldChar.toCharArray();
	    char []e=newChar.toCharArray();
	    String s=" ";
	    int count=0;
	    
	    for(int replace=0;replace<c.length;replace++){
	    	if(c[replace]==d[0]){
	    		count++;
	    	}
	    }
	    if(count>0){
	      for(int replace=c.length-1;replace>=0;replace--){
	        if(c[replace]==d[0]){
	          c[replace]=e[0];
	          break;
	        }
	      }
	      s=String.valueOf(c);
	    }
	    else{
	      s="The character u have given wasn't found the word";
	    }
	    return s;
	}

}
