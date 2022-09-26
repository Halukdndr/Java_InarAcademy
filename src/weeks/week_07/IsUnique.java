package weeks.week_07;

import java.util.Scanner;

public class IsUnique {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine();
        isUnique(str);

        if (isUnique(str) == true){
            System.out.println(" is unique");
        }else {
            System.out.println(" is not unique");
        }
    }
    public static boolean isUnique(String str) {
        boolean isUnique = true;
        outerloop:
        for (int i = 0;i < str.length();i++){

            for (int j = i + 1; j < str.length();j++){
                if (str.charAt(i) == str.charAt(j)){
                    isUnique = false;
                    break outerloop;
                }else {
                    isUnique = true;
                }
            }
        }
        return isUnique;
    }
}
