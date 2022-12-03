package chapters.chapter_12.exercises;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercise_16 {
    public static void main(String[] args) throws IOException {
        if (args.length != 3){
            System.out.println("usage: java Exercise12_16 file oldString newString");
            System.exit(0);
        }
        File file = new File(args[0]);
        if (!file.exists()){
            System.out.println("Source file " + args[0] + " does not exist");
            System.exit(1);
        }
        String s = "";
        try (Scanner input = new Scanner(file)){
            while (input.hasNext()){
                s += input.nextLine() + "\n";
                s = s.replaceAll(args[1],args[2]);
            }
        }
        try (PrintWriter output = new PrintWriter(file)){
            output.print(s);
        }
    }
}
