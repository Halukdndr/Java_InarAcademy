package chapters.chapter_12;

import java.net.URL;
import java.util.Scanner;

public class Exercise_19 {
    public static void main(String[] args) throws Exception{
        URL url = new URL("https://www.youtube.com/watch?v=VI4ssGtfdxw");
            int numberOfWords = 0;
        try (Scanner input = new Scanner(url.openStream())){
            while (input.hasNext()){
                String line = input.nextLine() + "\n";
                String[] words = line.split(" ");
                numberOfWords += words.length;
            }
        }
        System.out.println("https://www.youtube.com/watch?v=VI4ssGtfdxw has " + numberOfWords + " words");
    }
}
