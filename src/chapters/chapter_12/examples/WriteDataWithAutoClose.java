package chapters.chapter_12.examples;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteDataWithAutoClose {
    public static void main(String[] args) throws IOException {
        File file = new File("grades.txt");

        try (PrintWriter output = new PrintWriter(file)){
            output.print("Haydar ");
            output.println("BA");
            output.flush();
            output.print("Serhat ");
            output.println("AA");
        }
    }
}
