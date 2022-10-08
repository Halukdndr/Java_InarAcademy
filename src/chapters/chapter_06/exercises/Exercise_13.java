package chapters.chapter_06.exercises;

public class Exercise_13 {
    public static void main(String[] args) {
        printTitle();
        printBody();
    }

    public static void printBody() {
       for (int i = 1; i <= 20;i++){
           System.out.printf("%-2d          %7.4f\n",i,computeSumOfTheSeries(i));
       }
    }

    public static double computeSumOfTheSeries(int i) {
        double sum = 0;
        for (double j = 1; j <= i;j++) {
            sum += j / (j + 1);
        }
        return sum;
    }

    public static void printTitle() {
        System.out.println("i           m(i)");
        System.out.println("----------------------");
    }
}
