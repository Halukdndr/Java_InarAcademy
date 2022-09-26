package chapters.chapter_06.examples;

public class TerminatorReturn {
    public static void main(String[] args) {

        printGrade(100);
        printGrade(150);
        printGrade(55);
    }
    public static void printGrade(double score) {
        if (score < 0 || score > 100) {
            System.out.println("Invalid score");
            return;
        }
        if (score >= 90.0) {
            System.out.println('A');
        }
        else if (score >= 80.0) {
            System.out.println('B');
        }
        else if (score >= 70.0) {
            System.out.println('C');
        }
        else if (score >= 60.0) {
            System.out.println('D');
        }
        else {
            System.out.println('F');
        }
    }

}
