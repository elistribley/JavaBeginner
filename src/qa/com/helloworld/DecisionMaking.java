package qa.com.helloworld;

import java.util.Scanner;

public class DecisionMaking {
	
	public static void main(String[] args) {
		
		inputting();
	}

	
	public static void inputting() {
		System.out.println("Welcome to my fortune cookie game!");
		System.out.println("What number would you like to choose between 1 and 10?");
		Scanner input = new Scanner(System.in);
		int inputtedNum = input.nextInt();
		if (inputtedNum >= 5) {
			System.out.println("You will have a great day!");
		
		} else
			System.out.println("It is not going to be a good day!");
		
		
	}
	
	
}
