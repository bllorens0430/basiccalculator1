/**
 * 
 */
package basiccalculator1;
import java.util.Scanner;

/**
 * @author breallorens
 * Goal is to improve upon this code, eliminate repeating code, etc. 
 */
public class Calculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Telling the user what this app is and what they can do with it
		
		System.out.println("Simple Calculator");
		
		System.out.println("\nHere are your options:");
		System.out.println("\n1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		
		System.out.println("\nWhat would you like to do?");
		
		//Begin scanning for user input 
		int choice = STDIN.nextInt();
		System.out.println();
		
		//calls method depending on user input
		if (choice == 1) {
			doAddition();
		}
		else if (choice == 2) {
			doSubtraction();
		}
		else if (choice == 3) {
			doMultip();
		}
		else if (choice == 4) {
			doDivision();
		}
		//user input not permitted
		else {
			System.out.println("/nInvalid input. Please enter 1, 2, 3, or 4.");
		} 
		
		//Stop scanning for user input to avoid resource leak
		STDIN.close();	
	}
	
	//Encapsulation of redundant code asking, scanning, and storing user input for 2 numbers to be used in calculations 
	private static int[] getNumbers() {
		int[] numbers = new int[2];
		
		System.out.print("First number: ");
		numbers[0] = STDIN.nextInt();
		System.out.print("Second number: ");
		numbers[1] = STDIN.nextInt();
		STDIN.close();
		
		return numbers;
	}
	
	//Adds two values input by the user, prints result
	public static void doAddition() {
		//Call method to get user input
		int [] addVals = getNumbers();
		
		System.out.println("\nSum: " + addVals[0] + " + " + addVals[1] + " = " + (addVals[0] + addVals[1]));

	}
	
	//Subtracts second # from first # input by user, prints result
	public static void doSubtraction() {
		int [] subVals = getNumbers();
		
		System.out.println("\nDifference: " + subVals[0] + " -" + subVals[1] + " = " + (subVals[0] - subVals[1]));
	}
	
	// Multiplies both #'s input by user, prints result
	public static void doMultip() {
		int [] multVals = getNumbers();
		
		System.out.println("\nProduct: " + multVals[0] + " * " + multVals[1] + " = " + (multVals[0] * multVals[1]));
	}
	
	// Gets two #'s from user input, divides first by the second, prints result
	public static void doDivision() {
		int [] divVals = getNumbers();
	
		System.out.println("\nResult (rounded to nearest whole number): " + divVals[0] + " / " + divVals[1] + " = " + (divVals[0] / divVals[1]));
	}
	
	private static final Scanner STDIN = new Scanner(System.in);
	
} // End class
