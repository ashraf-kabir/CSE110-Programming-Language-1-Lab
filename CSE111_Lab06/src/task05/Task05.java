package task05;

public class Task05{
	
	String str;
	Task05 (String str){
		this.str=str;
	}
	
	String replaceFirst(String oldChar,String newChar){
		
		char [] ch =str.toCharArray();
		char [] oldC = oldChar.toCharArray();   //oldChar
		char [] newC = newChar.toCharArray();   //newChar
		
		String s=" ";
	    int count=0;
	    for(int replace=0;replace<ch.length;replace++){
	      if(ch[replace]==oldC[0]){
	       count++;
	      }
	    }
	    
	    if(count>0){
	      for(int replace=0; replace<ch.length; replace++){
	        if(ch[replace]==oldC[0]){
	          ch[replace]=newC[0];
	          break;
	        }
	      }
	      s=String.valueOf(ch);
	    }
	    else{
	      s="The character u have given wasn't found the word%n";
	    }
	    return s;
	}

}
