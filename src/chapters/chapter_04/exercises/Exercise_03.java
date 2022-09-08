package chapters.chapter_04.exercises;

public class Exercise_03 {

	public static void main(String[] args) {
		final double radius = 6_371.01;
		double xChar = 35.227085;
		double yChar = - 80.843124;
		double xAta = 33.753746;
		double yAta = - 84.386330;
		double xFlo = 27.994402;
		double yFlo = - 81.760254;
		double xSav = 32.076176;
		double ySav = - 81.088371;
		
		double dCA = radius * Math.acos(Math.sin(Math.toRadians(xChar)) * Math.sin(Math.toRadians(xAta)) + Math.cos(Math.toRadians(xChar)) * Math.cos(Math.toRadians(xAta)) * Math.cos(Math.toRadians(yChar - yAta) ));
		double dAS = radius * Math.acos(Math.sin(Math.toRadians(xAta)) * Math.sin(Math.toRadians(xSav)) + Math.cos(Math.toRadians(xAta)) * Math.cos(Math.toRadians(xSav)) * Math.cos(Math.toRadians(yAta - ySav) ));
		
		double dCS = radius * Math.acos(Math.sin(Math.toRadians(xChar)) * Math.sin(Math.toRadians(xSav)) + Math.cos(Math.toRadians(xChar)) * Math.cos(Math.toRadians(xSav)) * Math.cos(Math.toRadians(yChar - ySav) ));
		
		double dCF = radius * Math.acos(Math.sin(Math.toRadians(xChar)) * Math.sin(Math.toRadians(xFlo)) + Math.cos(Math.toRadians(xChar)) * Math.cos(Math.toRadians(xFlo)) * Math.cos(Math.toRadians(yChar - yFlo) ));
		double dFS = radius * Math.acos(Math.sin(Math.toRadians(xFlo)) * Math.sin(Math.toRadians(xSav)) + Math.cos(Math.toRadians(xFlo)) * Math.cos(Math.toRadians(xSav)) * Math.cos(Math.toRadians(yFlo - ySav) ));
		
		double s1 = (dCA + dAS + dCS) / 2;
		double area1 = Math.sqrt(s1 * (s1 - dCA) * (s1 - dAS) * (s1 - dCS));
		
		double s2 = (dCS + dCF + dFS) / 2;
		double area2 = Math.sqrt(s2 * (s2 - dCS) * (s2 - dCF) * (s2 - dFS));
		
		double totalArea = area1 + area2;
		
		System.out.println("The area between 4 states is " + totalArea + "km");
		
		
		
	}

}
