package chapters.chapter_11.examples;
import java.util.ArrayList;
import java.util.Scanner;
public class DistinctNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
            int value;
        do {
            System.out.println("Enter integers (input ends with 0): ");
            value = input.nextInt();
            if (!list.contains(value) && value != 0){
                list.add(value);
            }
        }while (value != 0);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        for (Integer e: list) {
            System.out.print(e + " ");
        }

    }

}
