package qa.com.helloworld;

public class HelloWorldExamples {
	public static double physics;
	public static double chemistry;
	public static double biology;
	public static double total;
	public static double percentage;

	public static void main(String[] args) {
		method1(120, 150, 110);
		method2();
		method3();
	}

	public static void method1(double phygrade, double chemgrade, double biograde) {

		physics = phygrade;
		chemistry = chemgrade;
		biology = biograde;

		total = physics + chemistry + biology;

		System.out.println("Your Physics Grade is: " + physics);

		System.out.println("Your Chemistry Grade is: " + chemistry);

		System.out.println("Your Biology Grade is: " + biology);

		System.out.println("Your Total Grade is: " + total);

	}

	public static void method2() {
		percentage = (total * 100) / 450;
		if (percentage>60) {
		
		System.out.println("Congrats! You've passed! Your Total Percentage is: " + percentage + "%");

	} else {
		System.out.println("Sorry you have failed! Your Total Percentage is: " + percentage + "%");
	}

	}
	public static void method3() {
		
		double percentagebio = (biology * 100) / 150;
		double percentagephy = (physics * 100) / 150;
		double percentagechem = (chemistry * 100) / 150;
		if (percentagebio<60) {
			System.out.println("Sorry you have failed! Your Biology result is: " + percentagebio + "%");
		} if (percentagephy<60) {
			System.out.println("Sorry you have failed! Your Physics result is: " + percentagephy + "%");
		} if (percentagechem<60)
			System.out.println("Sorry you have failed! Your Chemistry result is: " + percentagechem + "%");
			
	}

}











////hello();
////helloWorld();
////System.out.println("Hello World!");
////System.out.println("This is going to be rough");
//System.out.println(printMessage("Hello?"));
//}
//
//private static void helloWorld() {
//System.out.println("Hello World!");
//
//}
//private static void hello() {
//System.out.println("Hi Students!");
//	
//}
//
//public static String printMessage(String message) {
//return message;