package chapters.chapter_12.exercises;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Exercise_13 {
    public static void main(String[] args) throws IOException {
        if (args.length != 1){
            System.out.println("usage: java Exercise_13 fileName");
            System.exit(0);
        }
        File file = new File(args[0]);
        String s = "";
        int chars = 0;
        int words = 0;
        int lines = 0;
        try (Scanner input = new Scanner(file)){
            while (input.hasNext()){
                s = input.nextLine();
                String[] arr = s.split(" ");
                words += arr.length;
                chars += (s.length() - (arr.length - 1));
                lines++;
            }
        }
        System.out.println(args[0] + " has ");
        System.out.println(chars + " characters");
        System.out.println(words + " words");
        System.out.println(lines + " lines");
    }
}
