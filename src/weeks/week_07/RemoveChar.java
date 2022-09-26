package weeks.week_07;
import java.util.Scanner;
public class RemoveChar {
    public static void main(String[] args) {

        printRemoved();
    }
    public static void printRemoved(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1. string: ");
        String str1 = input.nextLine();
        System.out.println("Enter 2. string: ");
        String str2 = input.nextLine();
        System.out.println(removeChars(str1,str2));
    }
    public static String removeChars(String s1,String s2){
        String sum = "";
        for (int i = 0; i < s1.length();i++){
            if (s2.contains(s1.substring(i,i+1))){
                sum = sum;
            }else{
                sum += s1.substring(i,i+1);
            }
        }
        return sum;
    }
}
