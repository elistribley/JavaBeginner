package qa.com.helloworld;

public class UniqueSumTry {
	
	public static void main(String[] args) {
	System.out.println(uniqueSumThreeNumbers(3, 2, 9));	
		
	}

	private static int uniqueSumThreeNumbers(int num1, int num2, int num3) {
		// TODO Auto-generated method stub
		
		if (num1 == num2 && num1 == num3) {
		
		return 0;
		} else if (num1 == num2) {
			
			return num3;
			
		} else if (num1 == num3) {
			
			return num2;
		} else if (num2 == num3) {
			
			return num1;
		} else {
			
			
			return num1 + num2 + num3;
		}
		
		
		
		
		
		
		
	}
	
	
	

}
