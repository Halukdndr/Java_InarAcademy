package chapters.chapter_05.exercises;

import java.util.Scanner;

public class Exercise_08 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of students: ");
		int numOfStudents = input.nextInt();
		double theBestScore = 0;
		String theBestStudent = "";
		String name = "";
		double score = 0;
		for (int i = 0; i < numOfStudents; i++) {
			System.out.println("Enter the name of the student:");
			name = input.next();
			System.out.println("Enter the score of the student: ");
			score = input.nextDouble();
			
			if (score > theBestScore) {
				theBestScore = score;
				theBestStudent = name;
			}
			
		}
		System.out.println("The best student is " + theBestStudent + " and his/her score is " + theBestScore);
	}
}