package chapters.chapter_12.checkpoints;

import java.io.PrintWriter;

public class CheckPoint_32 {
    public static void main(String[] args) throws Exception{
        try (PrintWriter output = new PrintWriter("temp.txt");){
            output.printf("amount is %f %e\r\n", 32.32, 32.32);
            output.printf("amount is %5.4f %5.4e\r\n", 32.32, 32.32);
            output.printf("%6b\r\n", (1 > 2));
            output.printf("%6s\r\n", "Java");
        }


    }
}
