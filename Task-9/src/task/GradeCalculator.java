package task;

import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input
		System.out.println("Enter the marks scored by the student:");
		int marks = scanner.nextInt();
		scanner.close();

		// Calculate grade
		char grade;
		if (marks > 100) {
			System.out.println("Invalid Input");
			return;
		} else if (marks >= 90) {
			grade = 'A';
		} else if (marks >= 80) {
			grade = 'B';
		} else if (marks >= 70) {
			grade = 'C';
		} else if (marks >= 60) {
			grade = 'D';
		} else if (marks >= 50) {
			grade = 'E';
		} else {
			grade = 'F';
		}

		// Output
		System.out.println("Grade: " + grade);
	}
}
