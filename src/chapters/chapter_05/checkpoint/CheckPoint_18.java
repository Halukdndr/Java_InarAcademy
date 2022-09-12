package chapters.chapter_05.checkpoint;

public class CheckPoint_18 {

	public static void main(String[] args) {
		
		ShowErrors();
		ShowErrors1();
	}
	
	public static void ShowErrors() {
		
			int i = 0;
		 do {
	System.out.println(i + 4);
		i++;
	}while (i < 10);     //4,5,6,7,8,9,10,11,12,13
		}
	
	public static void ShowErrors1() {
		
	 		for (int i = 0; i < 10; i++){
	 		System.out.println(i + 4);
	 		}					//4,5,6,7,8,9,10,11,12,13
	}
	}
