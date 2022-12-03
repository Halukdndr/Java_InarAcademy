package chapters.chapter_12.exercises;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_14 {
    public static void main(String[] args) throws IOException {
        if (args.length != 1){
            System.out.println("usage: java Exercise_14 file ");
            System.exit(0);
        }

        File file = new File(args[0]);
        if (!file.exists()){
            System.out.println("there is no such file");
            System.exit(1);
        }

        String s = "";
        ArrayList<Integer> scores = new ArrayList<>();
        try (Scanner input = new Scanner(file)){
            while (input.hasNext()){
                s = input.nextLine();
                String[] arr = s.split(" ");
                for (int i = 0; i < arr.length; i++) {
                    scores.add(Integer.parseInt(arr[i]));
                }
            }
        }
        int total = 0;
        int size = scores.size();
        for (int i = 0; i < size; i++) {
            total += scores.get(i);
        }
        System.out.println("total: " + total);
        System.out.println("avarage: " + ((double)total / size));

    }
}
