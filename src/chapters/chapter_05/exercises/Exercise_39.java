package chapters.chapter_05.exercises;

public class Exercise_39 {

	public static void main(String[] args) {

		double COMMISSION_SOUGHT = 30_000;
		double baseSalary = 5_000;
		double salesAmount = 0;
		double commission = 0;
		COMMISSION_SOUGHT -= baseSalary;
		for (salesAmount = 0; commission < COMMISSION_SOUGHT ; salesAmount++ ) {
			if (salesAmount > 10_000) {
				commission = (salesAmount - 10_000) * 0.12 + 5_000 * 0.10 + 5_000 * 0.08;
			}else if (salesAmount > 5_000) {
				commission = (salesAmount - 5_000) * 0.10 + 5_000 * 0.08;
			}else if (salesAmount > 0) {
				commission = salesAmount * 0.08;
			}
		}
		System.out.println("You have to sell " + (salesAmount - 1) + "$ worth item");
		
	}

}
