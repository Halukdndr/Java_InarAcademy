package chapters.chapter_12.examples;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteData {
    public static void main(String[] args) throws IOException {
        File file = new File("scores.txt");
        if (file.exists()){
            System.out.println("File already exists");
            System.exit(1);
        }
    PrintWriter output = new PrintWriter(file);
        output.print("John ");
        output.println(90);
        output.print("Eric ");
        output.println(85);

        output.close();

        Scanner input = new Scanner(file);
        while (input.hasNext()) {
            System.out.println(input.nextLine());
        }
    }

}
