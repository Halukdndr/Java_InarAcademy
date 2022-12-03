package chapters.chapter_12.exercises;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_21 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Asus\\Desktop\\SortedStrings.txt");
        String[] arr;
        ArrayList<String> words = new ArrayList<>();
        try (Scanner input = new Scanner(file)){
            while (input.hasNext()){
                words.add(input.next());
            }
        }
        String s1 = "";
        String s2 = "";
        boolean isSorted = true;
        for (int i = 0; i < words.size() - 1; i++) {
            if (words.get(i).compareTo(words.get(i + 1)) > 0){
                s1 = words.get(i);
                s2 = words.get(i + 1);
                isSorted = false;
                break;
            }
        }
        if (isSorted){
            System.out.println(file.getName() + " is sorted");
        }else {
            System.out.println(s1 + " and " + s2 + " are out of order");
        }





    }
}
