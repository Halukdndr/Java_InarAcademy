package chapters.chapter_02;

public class CheckPoint_34_35_36_37 {

	public static void main(String[] args) {
		
		//34-- No.Gives dublicate local error.
		//35-- Integer data type has a range of (-2147483648 to 2147483647) and if you assign a value that out of it's range integer overflow occurs.Also in floating-point operations overflow occurs.
		//36-- yes
		
		byte a = (byte)128;
		System.out.println( a );
		
		//37--  Round off error occurs when we round a value in decimal part.
		 //integer ops doesn't cause round-off errors.
		//Floating point numbers may cause rounding off errors.
	}

}
