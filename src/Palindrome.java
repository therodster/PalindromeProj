/**
<h1>Palindrome</h1>
<p>This is a Palindrome checker.</p>

@author:	Sam Olaogun
@since:		10-29-2016
@version:	1.0
*/
import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {

		/** Initializes vars */
		Scanner scanner;
		String userInput;
		
		/** Prompts the user */
		System.out.println("Enter something. Maybe it's a Palindrome, maybe not...");

		/** Gets the user input */
		scanner = new Scanner(System.in);
		userInput = scanner.nextLine();

		/** Converts the String class to primitive type char (Works with words and decimals too!) */
		checker(userInput);

		/** Closes the scanner */
		scanner.close();

	}

	/**
	@param array	The array that is being checked
	@return 		Returns the true if true and false if false
	*/
	public static void checker(String s) {
	
		boolean returnVal = true;

		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) != s.charAt(s.length()-i-1)){
				returnVal = false;
				break;
			}			
		}

		/** Notifies the user */
		if (returnVal) System.out.println("That is a Palindrome!");
		else System.out.println("That is not a Palindrome!");

	}

}
