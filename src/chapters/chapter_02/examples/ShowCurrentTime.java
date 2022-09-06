package chapters.chapter_02.examples;

public class ShowCurrentTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 long totalMilliseconds = System.currentTimeMillis();
		 
		 long totalSeconds = totalMilliseconds / 1000;
		 
		 long totalMinutes = totalSeconds / 60;
		 
		 long totalHours = totalMinutes / 60;
		 
		 long hour = totalHours % 24 + 3 ;//i added the 3 hours to have Istanbul time 
		 
		 long minute = totalMinutes % 60;
		 
		 long second = totalSeconds % 60;
		 
		 long millisecond = totalMilliseconds % 1000;
		 
		 System.out.println("The current time is: " + hour + "."  + minute + "." + second + "." + millisecond );
		  
	}

}
