package qa.com.helloworld;

import java.util.Scanner;


public class StudentInfo {
	
	public static void main(String[] args) {
		
		inputtingInfo();
		
	}
	
	
	
	public static void inputtingInfo() {
		double studentGPA = 3.8;
		String studentFirstName ="Eli";
		String studentLastName ="Stribley";
		System.out.println(studentFirstName + " " + studentLastName + " has a GPA of " + studentGPA );
		System.out.println("What would you like to update?");
		Scanner input = new Scanner(System.in);
		studentGPA = input.nextDouble();
		System.out.println(studentFirstName + " " + studentLastName + " now has a GPA of " + studentGPA );
		
	}

}
