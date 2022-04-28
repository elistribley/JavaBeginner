package qa.com.helloworld;


public class BlackjackGame {
	
	public static void main(String[] args) {
		System.out.println(numbers(20, 18));
	}

	public static int numbers(int i, int j) {

		if (i > 21 && j > 21) {

			return 0;

		} else {

			if (i > j) {

				if (i > 21) {
					return j;
				} else {
					return i;
				}

			} else {

				if (j > 21) {
					return i;
						
						
					} else {
						
					return j;
				}

			}

		}
	}
	
	
	
		
}
