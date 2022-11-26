package chapters.chapter_12.examples;

import java.io.File;
import java.util.Scanner;

public class ReadData {
    public static void main(String[] args) throws Exception{
        File file = new File("grades.txt");
        System.out.println(file.exists());
        Scanner input = new Scanner(file);

        while (input.hasNext()){
            System.out.println(input.next());
        }
        input.close();

    }
}
