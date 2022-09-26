package chapters.chapter_06.examples;

public class TestVoidMethod {
    public static void main(String[] args) {

        printGrade(90);
        printGrade(75);
        printGrade(40);
    }
    public static void printGrade(double grade){
        if (grade >= 90){
            System.out.println('A');
        }else if (grade >= 80){
            System.out.println('B');
        }else if (grade >= 70){
            System.out.println('C');
        } else if (grade >= 60) {
            System.out.println('D');
        }else System.out.println('F');
    }
}
