public class Operations {
	/*
	The class is responsible for operations on numbers
	*/

	public static int multiply(int firstNumber, int secondNumber) {
		return firstNumber * secondNumber;
	}
	public static String divide(int firstNumber, int secondNumber) {
		// This method checks for division by zero.
		String x = null;
		try {
			x = String.valueOf(firstNumber / secondNumber);
		} catch (ArithmeticException e) {
			System.out.println("You entered 0! You can't divide by zero!\n");
			System.exit(1);
		}
		return x;
	}
	public static int addition(int firstNumber, int secondNumber) {
		return firstNumber + secondNumber;
	}
	public static int subtraction(int firstNumber, int secondNumber) {
		return firstNumber - secondNumber;
	}
}
