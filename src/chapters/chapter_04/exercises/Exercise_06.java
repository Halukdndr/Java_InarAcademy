package chapters.chapter_04.exercises;

public class Exercise_06 {

	public static void main(String[] args) {
		// Random points on a circle
		final int r = 40;
		
		// find random points to have triangle
		int n1 = (int)(Math.random() * 361);
		double a1 = Math.toRadians(n1);
		double x1 = r * Math.cos(a1);
		double y1 = r * Math.sin(a1);
		
		int n2 = (int)(Math.random() * 361);
		double a2 = Math.toRadians(n2);
		double x2 = r * Math.cos(a2);
		double y2 = r * Math.sin(a2);
		
		int n3 = (int)(Math.random() * 361);
		double a3 = Math.toRadians(n3);
		double x3 = r * Math.cos(a3);
		double y3 = r * Math.sin(a3);
		
		// compute sides 
		double k = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
		double l = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
		double m = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
		
		 // compute angles
		double K = Math.toDegrees(Math.acos((k * k - l * l - m * m ) / (-2 * l * m)));
		double L = Math.toDegrees(Math.acos((l * l - k * k - m * m ) / (-2 * k * m)));
		double M = Math.toDegrees(Math.acos((m * m - k * k - l * l ) / (-2 * k * l)));
		System.out.println(n1 + " " + n2 + " " + n3);
		System.out.println("Three angles in a triangle formed by random three points on the (0,0) centred,40 radius circle :" + K + " " + L + " " + M );
		

	}

}
