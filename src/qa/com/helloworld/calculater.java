package qa.com.helloworld;

public class calculater {

	public static double result;

	public static void main(String[] args) {

		System.out.println(add(5, 6));
		System.out.println(sub(20, 11));
		System.out.println(mul(5, 6));
		div(10, 2);
	}

	public static double add(double firstNumber, double secondNumber) {

		result = firstNumber + secondNumber;

		return result;
	}

	public static double sub(double firstNumber, double secondNumber) {

		result = firstNumber - secondNumber;

		return result;
	}

	public static double mul(double firstNumber, double secondNumber) {

		result = firstNumber * secondNumber;
		return result;
	}

	public static void div(double firstNumber, double secondNumber) {
		
		if (firstNumber<secondNumber) {
		result = (firstNumber / secondNumber);
		System.out.println(result);		
		
		} else {
			System.out.println("You cannot do that!");
			
		}
	}
}