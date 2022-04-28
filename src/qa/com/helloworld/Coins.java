package qa.com.helloworld;

public class Coins {
	
	
	public static void main(String[] args) {
		
		change(5.57, 20);
		
	}
	
	public static void change(double cost, double amount) {
		double change = amount-cost;
		System.out.println("Your new change amount is: £ " + change);
		System.out.println("Notes followed by Coins..");
		
		
		int tenPound=0;
		int fivePound=0;
		int twoPound=0;
		int onePound=0;
		int fiftyPence=0;
		int twentyPence=0;
		int tenPence=0;
		int fivePence=0;
		int twoPence=0;
		int onePence=0;
	
		
		if (change > 0.00) {
			

			while (change >= 10) {
				tenPound++;
				change -= 10;
			}

			if (tenPound > 0) {
				System.out.println(tenPound + " Ten Pounds");
			}

			while (change >= 5) {
				fivePound++;
				change -= 5;
			}

			if (fivePound > 0) {
				System.out.println(fivePound + " Five Pounds");
			}

			while (change >= 2) {
				twoPound++;
				change -= 2;
			}

			if (twoPound > 0) {
				System.out.println(twoPound + " Two Pounds");
			}

			while (change >= 1) {
				onePound++;
				change -= 1;
			}

			if (onePound > 0) {
				System.out.println(onePound + " One Pounds");
			}

			while (change >= 0.50) {
				fiftyPence++;
				change -= 0.50;
			}

			if (fiftyPence > 0) {
				System.out.println(fiftyPence + " Fifty Pence");
			}

			while (change >= 0.20) {
				twentyPence++;
				change -= 0.20;
			}

			if (twentyPence > 0) {
				System.out.println(twentyPence + " Twenty Pence");
			}

			while (change >= 0.10) {
				tenPence++;
				change -= 0.10;
			}

			if (tenPence > 0) {
				System.out.println(tenPence + " Ten Pence");
			}

			while (change >= 0.05) {
				fivePence++;
				change -= 0.05;
			}

			if (fivePence > 0) {
				System.out.println(fivePence + " Five Pence");
			}

			while (change > 0.01) {
				twoPence++;
				change -= 0.02;
			}

			if (twoPence > 0) {
				System.out.println(twoPence + " Two Pence");
			}

			while (change >= 0) {
				onePence++;
				change -= 0.01;
			}

			if (onePence > 0) {
				System.out.println(onePence + " One Pence");
			}
			System.out.println("---    Transaction completed!     ---");
			System.out.println("---Thank you for your transaction!---");

		}
		
		
		
	
		
	}
	
	

}
