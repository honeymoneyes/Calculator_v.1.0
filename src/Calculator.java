import java.util.Scanner;

public class Calculator {
	public static int lastChoice;
	public static int choice1;
	public static int firstNumber;
	public static int secondNumber;
	static Scanner sc = new Scanner(System.in);


	public static void setChoice() {
		choice1 = checkChoiceNumber();
	}

	public static void setFirstNumber() {
		firstNumber = checkFirstNumber();
	}

	public static void setSecondNumber() {
		secondNumber = checkSecondNumber();
	}


	public static int multiply(int firstNumber, int secondNumber) {
		return firstNumber * secondNumber;
	}
	public static void divide(int firstNumber, int secondNumber) {
		try {
			System.out.printf("Answer: %d\n", firstNumber / secondNumber);
		} catch (ArithmeticException e) {
			System.out.println("You entered 0! You can't divide by zero!\n");
		}
	}
	public static int addition(int firstNumber, int secondNumber) {
		return firstNumber + secondNumber;
	}
	public static int subtraction(int firstNumber, int secondNumber) {
		return firstNumber - secondNumber;
	}


	public static void print() {
		System.out.println("Welcome to Calculator!\n");
		System.out.println("Select an action: ");
		System.out.println("Addiction Ч 1");
		System.out.println("Subtraction Ч 2");
		System.out.println("Divide Ч 3");
		System.out.println("Multiply Ч 4\n");
		System.out.println("Enter selection here: ");
	}

	public static int checkChoiceNumber() {
		String choice;
		int choiceStatic;
		while (true) {
			try {  // selection check
				choice = sc.nextLine();
				choiceStatic = Integer.parseInt(choice);
				break;
			} catch (NumberFormatException e) {
				System.out.println("Enter the number: ");
			}
		}
		return choiceStatic;
	}

	public static int checkFirstNumber() {
		System.out.println("Enter the first number: ");
		String firstNumber;
		int number_1;
		while (true) { // cycle to enter the first number
			try { // checking for a number
				firstNumber = sc.nextLine();
				number_1 = Integer.parseInt(firstNumber);
				break;
			} catch (NumberFormatException e) {
				System.out.println("You entered NOT a number! Enter the number!");
			}
		}
		return number_1;
	}

	public static int checkSecondNumber() {
		System.out.println("Enter the second number: ");
		String secondNumber;
		int number_2;
		while (true) {
			try {
				secondNumber = sc.nextLine();
				number_2 = Integer.parseInt(secondNumber);
				break;
			} catch (NumberFormatException e) {
				System.out.println("You entered NOT a number! Enter the number!");
			}
		}
		return number_2;
	}

	public static void result() {
		switch (choice1) {  // ¬вод выбора
			case 1 -> System.out.printf("Answer: %d\n", addition(firstNumber, secondNumber));
			case 2 -> System.out.printf("Answer: %d\n", subtraction(firstNumber, secondNumber));
			case 3 -> divide(firstNumber, secondNumber);
			case 4 -> System.out.printf("Answer: %d\n", multiply(firstNumber, secondNumber));
		}
	}

	public static void nextContinue() {
		boolean is_0 = true;
		System.out.println("Do you want to continue? ( 1 Ч Yes, 2 Ч No )");
		while (is_0) {
			try {
				String choiceNextOrStop = sc.nextLine();
				lastChoice = Integer.parseInt(choiceNextOrStop);
				switch (lastChoice) {
					case 1:
						mainJob();
					case 2:
						System.out.println("Good luck!");
						is_0 = false;
				}
			} catch (NumberFormatException e) {
				System.out.println("You entered NOT number! Enter number!");
			}
		}
	}
	public static void mainJob() {
		print(); // ¬ывод текста приветстви€ и выбора
		setChoice();
		setFirstNumber();
		setSecondNumber();
		result();
		nextContinue();
	}
}
`