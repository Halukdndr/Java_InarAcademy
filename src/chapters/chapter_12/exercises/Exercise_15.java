package chapters.chapter_12.exercises;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercise_15 {
    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\Asus\\Desktop\\Exercise12_15.txt");
        if (file.exists()) {
            System.out.println("There is already a file with the same name");
            System.exit(1);
        }

        try (PrintWriter output = new PrintWriter(file)){
            for (int i = 0; i < 100; i++) {
                int num = (int)(Math.random() * 100);
                output.print(num + " ");
            }
            output.close();
        }
        try (Scanner input = new Scanner(file)){
            while (input.hasNext()){
                System.out.println(input.nextLine());
            }
        }
    }
}
