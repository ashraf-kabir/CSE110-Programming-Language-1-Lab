package task06;

public class Task06{
	  
	String a;
	  
	Task06 (String a){
		this.a=a;
	}
	String replaceAll(String oldChar,String newChar){
	    
		char[]c=a.toCharArray();
	    char[]d=oldChar.toCharArray();
	    char[]e=newChar.toCharArray();
	    String s=" ";
	    int count=0;
	    
	    for(int replace=0; replace<c.length; replace++){
	      if(c[replace]==d[0]){
	       count++;
	      }
	    }
	    if(count>0){
	      for(int replace=0;replace<c.length;replace++){
	        if(c[replace]==d[0]){
	          c[replace]=e[0];
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
