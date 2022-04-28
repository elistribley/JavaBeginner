package qa.com.helloworld;

public class NewIterations {

	public static void main(String[] args) {
		catPrinter();
		doWhile();
		forLoop();
	}
//WHILE
	public static void catPrinter() {
		int catCount = 5;
		boolean notEnoughCats = true;

		while (catCount <= 50) {

			System.out.println(catCount + ": Another cat");
			catCount++;

		}
		System.out.println("You have enough cats!");
	}
//DO WHILE
	public static void doWhile() {
		int playCount = 0;
		boolean playing = true;

		do {

			System.out.println(playCount + ": playing");
			playCount++;
			
			if(playCount==7) {
				
				playing=false;
			}

		} while (playing);
		System.out.println("Game Over!");

	}
	
	//FOR LOOP
	
	public static void forLoop() {
		
		for (byte i = 0; i<10; i++) {
			System.out.println(i);
			
		}
			
			
		
	}

}
