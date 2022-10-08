package chapters.chapter_06.exercises;

public class Exercise_14 {
    public static void main(String[] args) {
        printTitle();
        printBody();
    }

    public static void printTitle() {
        System.out.println("i                  m(i)");
        System.out.println("---------------------------");
    }

    public static void printBody() {
        for (int i = 1; i <= 901; i += 100) {
            System.out.printf("%-3d                %5.4f\n",i,estimatePI(i));
        }
    }

    public static double estimatePI(int i) {
        double sum = 0;
        for (int j = 1;j <= i; j++){
            sum += Math.pow(-1,(j + 1.0)) / (2.0 * j - 1);
        }
        double pi = sum * 4;
        return pi;
    }
}
