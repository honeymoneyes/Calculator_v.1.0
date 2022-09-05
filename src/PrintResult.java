public class PrintResult {
	/*
	This class is responsible for the result of operations
	*/

	public static void result() {
		switch (InputValidation.firstChoice) {  // Select input
			case 1 -> System.out.printf("Answer: %d\n", Operations.addition(InputValidation.firstNumber, InputValidation.secondNumber));
			case 2 -> System.out.printf("Answer: %d\n", Operations.subtraction(InputValidation.firstNumber, InputValidation.secondNumber));
			case 3 -> System.out.printf("Answer: %s\n", Operations.divide(InputValidation.firstNumber, InputValidation.secondNumber));
			case 4 -> System.out.printf("Answer: %d\n", Operations.multiply(InputValidation.firstNumber, InputValidation.secondNumber));
		}
	}
}
