public class Calculator {

	/*This class executes all methods of the program*/
	public static void mainJob() {
		GetPrint.print(); // Display welcome and selection text
		InputValidation.mainInputValidation(); // Input validation and assignment
		PrintResult.result(); // Result Output
		Restart.nextContinue(); // Restarting the program
	}
}