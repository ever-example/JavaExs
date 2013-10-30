
/**
*@author Eric Yang
*
*This program prompts the user to input a String consisting of the chars
*'1' and/or '0'. and interprets the string as a binary number. The equivalent
*binary number is then translated to it's equivalent unsigned integer
*representation and output to the client.
*/

import java.util.Scanner;

public class Lab5B {
	public static void main(String[] args) {
		// Create new Scanner object to receive user inpu
		Scanner input = new Scanner(System.in);
		String bitString;
		// Prompt user for input
		System.out.println("Please input a String of bits: "); 
		int nEq = 0;
		// Store user input and obtain the length
		bitString = input.next();
		int lenStr = bitString.length();

		// Test each character for every index of the String
		for (int i = 0; i < lenStr; i++) {
			if (bitString.charAt(i) == '0') {
				//do nothing
			} else if (bitString.charAt(i) == '1') {
				// Add the appropriate power of two to the final sum
				int pow2;
				// 2^0 = 1; test if we are on the last bit
				if (i == (lenStr-1)) {
					pow2 = 1;
				} else {
					pow2 = 2;
					for (int j = 0; j < (lenStr-2 - i); j++) {
						pow2 = pow2 * 2;
					}
				}
				nEq = nEq + pow2;

			} else {
				// Print out an error message if the String is invalid and exit
				System.out.println("Error: The String should only consist of 1's and 0's.");
				System.exit(0);
			}
		}

		// Print out our results
		System.out.println("The String you entered was: " + bitString + " representing " + lenStr + " bit(s).");
		System.out.println("The equivalent integer is: " + nEq);
	}
}
