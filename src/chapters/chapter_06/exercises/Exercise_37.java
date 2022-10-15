package chapters.chapter_06.exercises;

import java.util.Scanner;

public class Exercise_37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number :");
        int number = input.nextInt();
        System.out.println("Enter width of the number: ");
        int width = input.nextInt();
        System.out.println(format(number,width));
    }
    public static String format(int number, int width){
        String num = number + "";
        String sum = "";
        if (num.length() <= width){
            for (int i = 0; i < width - num.length();i++){
                sum += "0";
            }
        }else{
            sum += "";
        }
        return sum + num;
    }
}
