package qa.com.helloworld;

public class flowchart {
	
	public static void main(String[] args) {

		firstTaskFlow();
		secondTaskFlow();
		tenPrintLot();
		tenAlternate();

	}

	private static void firstTaskFlow() {

		for (int A = 100; A < 200; A++) {
			System.out.println(A);
		}

	}
	private static void secondTaskFlow() {

		for (int A = 100; A <= 200; A++) {
			if (A % 2 == 0) {
				System.out.println("-");
			} else {
				System.out.println("*");
			}
		}
	}
	private static void tenPrintLot() {

		for (int i = 0; i < 10; i++) {

			for (int n = 0; n < 10; n++) {
				System.out.println(n + 1);
			}

		}

	}

	


	private static void lastStage(int total) {

		for (int i = 0; i < total; i++) {
			System.out.println(total);
		}

	}

	private static void tenAlternate() {

		for (int i = 0; i < 10; i++) {

			lastStage(i + 1);

		}

	}

}
