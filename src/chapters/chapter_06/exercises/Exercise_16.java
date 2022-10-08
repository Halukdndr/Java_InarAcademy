package chapters.chapter_06.exercises;

public class Exercise_16 {
    public static void main(String[] args) {
        for (int i = 2000;i <= 2020;i++){
            System.out.println(i + " has " + numberOfDaysInAYear(i) + " days");
        }
    }
    public static int numberOfDaysInAYear(int year){
        if(isLeap(year)){
            return 366;
        }else{
            return 365;
        }
    }
    public static boolean isLeap(int year){
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}
