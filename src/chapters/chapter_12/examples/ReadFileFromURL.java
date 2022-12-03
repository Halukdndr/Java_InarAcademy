package chapters.chapter_12.examples;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class ReadFileFromURL {
    public static void main(String[] args) throws MalformedURLException{
        String s = new Scanner(System.in).next();
        try {
            URL url = new URL(s);
            int count = 0;
            Scanner input = new Scanner(url.openStream());
            while (input.hasNext()){
                String line = input.nextLine();
                count += line.length();
                System.out.println(line);
            }
            System.out.println("The file size is " + count + " characters");
        }catch (MalformedURLException ex){
            System.out.println("Invalid URL");
        } catch (IOException e) {
            System.out.println("I/O Errors: no such file");        }
    }
}
