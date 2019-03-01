package task07;

public class Task07 {

	public static void main(String[] args) {
		
		String s1 = "ABC";
		String s2 = "ABD";
		
		String s3 = "ABC";
		String s4 = "ABDEF";
		
		String s5 = "ABC";
		String s6 = "ABCDEF";
		
		String s7 = "ABCDEF";
		String s8 = "ABC";
		
		String s9 = "PQR";
		String s10 = "pQR";
		
		String s11 = "PQR";
		String s12 = "PqRs";
		
		String s13 = "PQRSTU";
		String s14 = "ABCDEF";
		String s15 = "abcdef";
		
		String s16 = "  ABC  DEF  GHI  ";
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo("Adc"));
		System.out.println(s3.compareTo(s4));
		System.out.println(s5.compareTo(s6));
		System.out.println(s7.compareTo(s8));
		System.out.println(s9.compareToIgnoreCase(s10));
		System.out.println(s11.compareToIgnoreCase(s12));         //s11 - s12 = 0-1(length)
		System.out.println(s11.compareToIgnoreCase("pqr"));
		
		System.out.println(s1.startsWith("AB"));
		System.out.println(s1.startsWith("C"));
		System.out.println(s1.startsWith("AB", 0));
		System.out.println(s1.startsWith("AB", 1));
		System.out.println(s1.startsWith("AB", 3));
		System.out.println(s1.startsWith(s2));
		
		System.out.println(s4.endsWith("EF"));     //no range from reverse
		System.out.println(s4.endsWith("EF"));     //no range from reverse
		
		System.out.println(s7.equals(s8));
		System.out.println(s7.equals(s13));
		System.out.println(s7.equals(s14));     //true
		System.out.println(s15.equalsIgnoreCase(s7));
		System.out.println(s7.equalsIgnoreCase("aBcDeF"));
		
		System.out.println(s13.indexOf('R'));
		System.out.println(s15.lastIndexOf('f', 5));
		
		System.out.println(s14.length());        //length of s14 is 6 but index will end at 5
		
		System.out.println(s13.replace('Q', 'X'));
		
		System.out.println(s15.substring(3));      //begin index
		System.out.println(s15.substring(2, 5));       //beginning & ending index both && important
		
		System.out.println(s15.toCharArray());
		
		System.out.println(s15.toUpperCase());
		System.out.println(s14.toLowerCase());
		
		System.out.println(s16.trim());       //just clear the spaces of beginning and ending
		
		//System.out.println(s15.valueOf(5));
	}

}
