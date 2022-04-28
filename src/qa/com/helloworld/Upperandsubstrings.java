package qa.com.helloworld;
import java.util.*;
public class Upperandsubstrings {
	
	public static void main(String[] args) {
		String str1 = "Hope you're having a nice day";
		verticalStrings();
		reversevertsStrings();
		findingvaluesinStrings();
	
	}

	private static void findingvaluesinStrings() {
		
		
	}

	private static void reversevertsStrings() {
	
		
	}

	private static void verticalStrings() {
	
		
	}

	private static void countStrings(String A) {
	
	
	int wordCount= 0;
	for (int i =0; i < A.length(); i++) {
		
		if (A.substring(i, i + 1).equals(" ") || i == (A.length() - 1)) {
			
		wordCount++;
		
		
		}
		System.out.println(wordCount);
	}

	
	}

}






//String str1 = " yesterday it was raining";
//String str2 = "today it is sunny,";
//
//System.out.println(str2.toUpperCase() + " " + str1.toUpperCase());
//
//String MySubString1 = str2.substring(0, 11);
//String MySubString2 = str1.substring(17, 25);
//System.out.println(MySubString1 + MySubString2);