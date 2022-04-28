package qa.com.helloworld;

public class StringManip {

	public static void main(String[] args) {
		
		
		String strl= "ThisIssOMeTeXT";
		
		System.out.println(strl.toLowerCase());
		System.out.println(strl.toUpperCase());
		System.out.println(strl.charAt(5));
		System.out.println(strl.indexOf("T"));
		System.out.println(strl.endsWith("e"));
		System.out.println(strl.startsWith("x"));
		System.out.println(strl.contains("ex"));
		
		
//		String myStr = "I like new strings";
//		String myStr1 = new String("I like strings");
//		String myStr2 = "I like strings";
//		
//		System.out.println(myStr.equals(myStr2));
//		
//		//myStr1 specified a new string, so myStr1 is not = to myStr and myStr2 but the latter two are equal.
//		//equals. is used for string to compare objects(values)
//		
//		for (int i= 0; i<myStr.length(); i++);{
//			System.out.println(myStr.charAt(i));
//	}
//		
//		System.out.println("String length is " + myStr.length());
	}
	
}
