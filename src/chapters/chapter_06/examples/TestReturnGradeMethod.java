package chapters.chapter_06.examples;

public class TestReturnGradeMethod {
    public static void main(String[] args) {

        System.out.println("The grade of JANE is " + getGrade(95));
        System.out.println("The grade of GALE is " + getGrade(68));
        System.out.println("The grade of NATHAN is " + getGrade(48));
    }
    public static char getGrade(int score){
        if (score >= 90){
           return 'A';
        }else if (score >= 80){
            return 'B';
        }else if (score >= 70){
            return 'C';
        } else if (score >= 60) {
            return 'D';
        }else return 'F';
    }
    }

