package chapters.chapter_05.checkpoint;

public class CheckPoint_17 {

	public static void main(String[] args) {
		int sum = 0;
		int j = 0;
		int i = 0;
		for ( i = 0; i < 10; i++){
		    sum += i;
		
		 while (j < 10){
	 	j++;
	 	}

	 	do {
	 	j++;
	 	} while (j < 10);
		}
			if (i < j){
	 		System.out.println(i);
	 	   	}else
	 		System.out.println(j);
			
			System.out.println(sum);
	 }
	}