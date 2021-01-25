	/**
	 *
	 * File name: TemperatureConverter.java
	 *
	 *This program does the following:
	 *Prompts the user to enter a temperature in Fahrenheit and a
	 *temperature scale the user wants to convert it to. If both the temperature in Fahrenheit  and
	 *the temperature scale are valid, the program converts the temperature in Fahrenheit to 
	 *the specified temperature scale and displays the converted value.
	 *
	*/
import java.util.Scanner;

public class TemperatureConverter {

	public static void main(String[] args) {

		// Declare named constants.

		final double MIN_FAHRENHEIT = -459.67;

		// Declare the variables. 

		double fahrenheit;
		double convertedDegrees;
		int tempScale;
		String tempScaleStr="";
		System.out.println(tempScaleStr);

		// Creating the Scanner object
		Scanner keyboard =  new Scanner(System.in);

		System.out.print("Enter the temperature in Fahrenheit: ");               
		fahrenheit =  keyboard.nextDouble();  // Set a breakpoint here   

		// Verify the user's input
		if (fahrenheit < MIN_FAHRENHEIT) {   // first if-statement: Set a breakpoint here
			// ^ switched it from > to <
			System.out.print("The temperature must be greater than or equal to " + MIN_FAHRENHEIT);
			System.exit(0);
		}else System.out.print (
				"Enter the temperature scales you want to convert to:\n"+ 
						"1. Kelvin \n"+
						"2. Rankine \n"+
						"3. Reaumur \n"+
						"4. Celsius\n"+
				"Enter a temperature scale: ");
				tempScale = keyboard.nextInt();

		if (tempScale > 4 || tempScale < 1) {  // Second-if statement: Set a breakpoint here
			//switched the 1 and the 4 and changed from a conjunct statement to a disjunct statement
			System.out.println("Unknown temperature scale  -" +
					"  cannot do calculation. Bye");
			System.exit(0);
		}
		else {
			if (tempScale == 1) { // Set a breakpoint here
				convertedDegrees = (fahrenheit + MIN_FAHRENHEIT) *5/9;
				tempScaleStr="Kelvin"; 
			} else if (tempScale == 2) { 
				convertedDegrees = fahrenheit + MIN_FAHRENHEIT;  
				tempScaleStr="Rankine";
			} else if (tempScale == 3) { 
				convertedDegrees = (fahrenheit - 32)*4/9 ; // Set a breakpoint here
				tempScaleStr="Reaumur";
			} else {
				convertedDegrees = (fahrenheit - 32)*5/9; // Set a breakpoint here
				tempScaleStr="Celsius";
			}

			System.out.println(fahrenheit + " degrees Fahrenheit is " + convertedDegrees + " degrees "+ tempScaleStr + ".");
		}
	}

	{
}

}
