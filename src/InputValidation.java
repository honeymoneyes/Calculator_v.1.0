import java.util.Scanner;

public class InputValidation {
	/*
	The class is responsible for validating the entered data
	*/

	public static int firstChoice; // The variable stores the user's choice of the calculator's action option.
	public static int firstNumber; // The variable stores the input of the first number.
	public static int secondNumber; // The variable stores the input of the second number.
	static Scanner sc = new Scanner(System.in);

	public static void mainInputValidation() {
		/*
		Method runs setters
		*/
		setChoice();
		setFirstNumber();
		setSecondNumber();
	}

	public static void setChoice() {
		/*
		The method assigns to a variable the validated action
		selection input from the validation methods below
		*/
		InputValidation input = new InputValidation();
		firstChoice = input.checkChoiceNumber();
	}

	public static void setFirstNumber() {
		/*
		The method assigns to the variable the tested input of
		the first number from the validation methods below
		*/
		firstNumber = checkFirstNumber();
	}


	public static void setSecondNumber() {
		/*
		The method assigns to the variable the tested input of
		the second number from the validation methods below
		*/
		secondNumber = checkSecondNumber();
	}

	public int checkChoiceNumber() {
		/*
		The method checks the input for an error and
		returns the response in the setters above
		*/
		String choice;
		int choiceStatic;
		while (true) { // cycle to enter the first number
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
		/*
		The method checks the input for an error and
		returns the response in the setters above
		*/
		System.out.println("Enter the first number: ");
		String firstNumber;
		int checkFirst;
		while (true) { // cycle to enter the first number
			try { // selection check
				firstNumber = sc.nextLine();
				checkFirst = Integer.parseInt(firstNumber);
				break;
			} catch (NumberFormatException e) {
				System.out.println("You entered NOT a number! Enter the number!");
			}
		}
		return checkFirst;
	}

	public static int checkSecondNumber() {
		/*
		The method checks the input for an error and
		returns the response in the setters above
		*/
		System.out.println("Enter the second number: ");
		String secondNumber;
		int checkSecond;
		while (true) { // cycle to enter the second number
			try { // selection check
				secondNumber = sc.nextLine();
				checkSecond = Integer.parseInt(secondNumber);
				break;
			} catch (NumberFormatException e) {
				System.out.println("You entered NOT a number! Enter the number!");
			}
		}
		return checkSecond;
	}
}
