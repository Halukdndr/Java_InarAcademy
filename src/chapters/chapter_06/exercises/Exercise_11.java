package chapters.chapter_06.exercises;

public class Exercise_11 {
    public static void main(String[] args) {
        printTitleOfTheTable();
        printBody();
    }

    public static void printBody() {
        for (int salesAmount = 10_000; salesAmount <= 100_000;salesAmount += 5_000){
            System.out.printf("%-6d",salesAmount);
            System.out.printf("%12s"," ");
            System.out.printf("%8.1f\n",computeCommission(salesAmount));
        }
    }

    public static void printTitleOfTheTable() {
        System.out.println("Sales Amount        Commission");
        System.out.println("_______________________________");
    }

    public static double computeCommission(double salesAmount){
        double comission = 0;
        if(salesAmount <= 5_000){
            comission = salesAmount * 0.08;
        } else if (salesAmount <= 10_000) {
            comission = 5_000 * 0.08 + (salesAmount - 5_000) * 0.1;
        }else{
            comission = 5_000 * 0.08 + 5_000 * 0.1 + (salesAmount - 10_000) * 0.12;
        }
            return comission;

    }
}
