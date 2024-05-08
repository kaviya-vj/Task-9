package task;

	import java.util.Scanner;

	public class StringReversal {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();
	        scanner.close();
	        
	        String reversedString = reverseString(input);
	        System.out.println("Reversed string: " + reversedString);
	    }
	    
	    public static String reverseString(String s) {
	        // Create a StringBuilder object to store the reversed string
	        StringBuilder reversed = new StringBuilder();
	        
	        // Iterate through the string in reverse order using a for loop
	        for(int i = s.length() - 1; i >= 0; i--) {
	            // Append each character to the StringBuilder object
	            reversed.append(s.charAt(i));
	        }
	        
	        // Convert the StringBuilder object to a String and return it
	        return reversed.toString();
	    }
	}

