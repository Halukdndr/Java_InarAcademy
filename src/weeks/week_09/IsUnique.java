package weeks.week_09;

import java.util.Scanner;

public class IsUnique {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = input.nextLine();

        System.out.println(isUnique(str));
        char[] ch = new char[str.length()];
        for (int i = 0; i < str.length();i++){
            ch[i] = str.charAt(i);
        }
        System.out.println(isUnique(ch));

    }

    public static boolean isUnique(String s) {
        boolean[] asciiTable = new boolean[128];
        int stepCounter = 0;
        for (int i = 0; i < s.length();i++) {
            stepCounter++;
            int index = s.charAt(i);
            if (asciiTable[index]){
                System.out.println("The step number is " + stepCounter);
                return false;
            }else{
                asciiTable[index] = true;
            }
        }
        System.out.println("The step number is " + stepCounter);
        return true;
    }

    public static boolean isUnique(char[] ch) {
        int stepCounter = 0;
        for (int i = 0; i < ch.length - 1; i++){
            stepCounter++;
            for (int j = i + 1; j < ch.length; j++){
                stepCounter++;
                if(ch[i] == ch[j]){
                    System.out.println("The step number is " + stepCounter);
                    return false;
                }
            }
        }
        System.out.println("The step number is " + stepCounter);
        return true;
    }
}
