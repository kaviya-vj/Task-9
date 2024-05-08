package task;

//package task;
//
//import java.util.Scanner;
//
//public class Task1 {
//
//	public static void main(String[] args) {
//		
//Scanner sc = new Scanner(System.in);
//
//System.out.println("Enter the given string");
//
//String inputString = sc.nextLine();
//
//if(isPalindrome(inputString)) {
//	
//	System.out.println("The given string is a palindrome");
//	
//}
//else {
//	System.out.println("The given string is not a palindrome");
//}
//		
//	}
//
//	private static boolean isPalindrome(String inputString) {
//		
//		inputString.replaceAll(inputString, inputString)
//		return false;
//	}
//
//}
import java.util.Scanner;

public class PalindromeChecker {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = scanner.nextLine();
		scanner.close();

		if (isPalindrome(input)) {
			System.out.println("The string is a palindrome.");
		} else {
			System.out.println("The string is not a palindrome.");
		}
	}

	public static boolean isPalindrome(String s) {
		// Convert the string to lowercase to make it case-insensitive
		s = s.toLowerCase();

		// Initialize variables for indexing
		int startIndex = 0;
		int endIndex = s.length() - 1;

		// Iterate through the string using a for loop
		for (int i = 0; i < s.length() -1; i++) {
			// Check if characters at the start and end indices are equal
			if (s.charAt(startIndex) != s.charAt(endIndex)) {
				return false;
			}
			// Move the start index forward and the end index backward
			startIndex++;
			endIndex--;
		}

		// If the loop completes without finding any unequal characters, it's a
		// palindrome
		return true;
	}
}