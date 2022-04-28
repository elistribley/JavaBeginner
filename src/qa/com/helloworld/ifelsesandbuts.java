package qa.com.helloworld;

public class ifelsesandbuts {

	public static void main (String[] args) {
		
		canEliJava(true);
		numbersJava();
		
	}
	
	
	public static void canEliJava(boolean canEliJava) {
		
		
		
		if (canEliJava) {
			
			System.out.println("Eli can Java!");
		} else
			System.out.println("Eli cannot Java!");
		
	}
	
	public static void numbersJava() {
		int number = 40;
		
		if (number <= 20) {
			
			System.out.println("Number is less than or equal to 20!");
		} else
			System.out.println("Number is greater than 40!");
	}
	
}
