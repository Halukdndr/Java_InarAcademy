package chapters.chapter_05.checkpoint;

public class CheckPoint_27 {

	public static void main(String[] args) { // break terminates just the loop which belongs to.
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 4; j++) {
				if (i * j > 2)
					break;
				System.out.println(i * j);
			}
			System.out.println(i);
		}

		System.out.println("--------------------------------------"); // continues work principle is same as break 

		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 4; j++) {
				if (i * j > 2)
					continue;
				System.out.println(i * j);
			}
			System.out.println(i);   // the outpus are same
		}

	}

}
