package chapters.chapter_05.exercises;

import java.util.Scanner;

public class Exercise_09 {

	public static void main(String[] args) {
		
		// TODO not finished!!!!!
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of students: ");
		int numOfStudents = input.nextInt();
		String theBestStudent = "";
		double theBestScore = 0;
		String theSecondStudent = "";
		double theSecondScore = 0;
		String name = "";
		double score = 0;
		for (int i = 0; i < numOfStudents; i++) {
			System.out.println("Enter the name of the student:");
			name = input.next();
			System.out.println("Enter the score of the student: ");
			score = input.nextDouble();

			if (score > theSecondScore) {
				theSecondStudent = theBestStudent;
				theSecondScore = theBestScore;
				if (score > theBestScore) {
					theBestScore = score;
					theBestStudent = name;
				}
			}

		}
		System.out.println("The best student is " + theBestStudent + " and his/her score is " + theBestScore);
		System.out.println("The second student is " + theSecondStudent + " and his/her score is " + theSecondScore);
	}
}