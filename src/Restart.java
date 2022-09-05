import java.util.Scanner;

public class Restart {
	/*
	This class is responsible for restarting the program
	*/
	public static int lastChoice;
	static Scanner sc = new Scanner(System.in);
	public static void nextContinue() {
		boolean is_0 = true;
		System.out.println("Do you want to continue? ( 1 — Yes, 2 — No )");
		while (is_0) { // input error loop
			try {
				String choiceNextOrStop = sc.nextLine();
				lastChoice = Integer.parseInt(choiceNextOrStop);
				switch (lastChoice) {
					case 1:
						Calculator.mainJob();
					case 2:
						System.out.println("Good luck!");
						is_0 = false;
				}
			} catch (NumberFormatException e) {
				System.out.println("You entered NOT number! Enter number!");
			}
		}
	}
}
