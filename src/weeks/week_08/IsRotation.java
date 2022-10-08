package weeks.week_08;

import java.util.Scanner;

public class IsRotation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first string");
        String str1 = input.nextLine();
        System.out.println("Enter 2. string");
        String str2 = input.nextLine();
        System.out.println(isRotation(str1,str2));

    }

    public static boolean isRotation(String s1,String s2) {
        boolean isRotation = false;
        String str3 = "";

            for(int j = 1; j < s1.length(); j++){
                str3 = s1.substring(j) + s1.substring(0,j);
                if (str3.equals(s2)){
                    isRotation = true;
                    break;
                }else{
                    isRotation = false;
                }
            }
    return isRotation;
    }
}
