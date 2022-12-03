package chapters.chapter_12.exercises;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_17 {
    public static final int TRY_LIMIT = 4;
    public static int countOfTry;
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Asus\\Desktop\\Yeni.txt");
        if (!file.exists()){
            System.out.println("There is no such file");
            System.exit(0);
        }
        String line = "";

        ArrayList<String> words = new ArrayList();
        try (Scanner input = new Scanner(file)){
            while (input.hasNext()){
                line = input.nextLine();
                String[] arr = line.split(" ");
                for (int i = 0; i < arr.length; i++) {
                    words.add(arr[i]);
                }
            }
        }
        game(words);
    }
    public static void game(ArrayList<String> words){
        Scanner input = new Scanner(System.in);
        countOfTry = -1;
        String word = words.remove((int) (Math.random() * words.size()));
        String guess = " ";
        String hiddenWord = "";
        for (int i = 0; i < word.length(); i++) {
            hiddenWord += "*";
        }
        do {
            if (!word.contains(guess.charAt(0) + "") && guess.length() == 1){
                System.out.println("Enter a letter in word " + hiddenWord + " or try to guess");
                countOfTry++;
            }else if (guess.length() == 1){
                String temp = "";
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == guess.charAt(0)){
                        temp += guess.charAt(0);
                    }else {
                        temp += hiddenWord.charAt(i);
                    }
                }
                hiddenWord = temp;
                System.out.println("Enter a letter in word " + hiddenWord + " or try to guess");
            }
            guess = input.nextLine();
            if (guess.length() > 1 && sameWords(word,guess)){
                System.out.println("You found it!Do you want to guess another word?Enter y or n");
                if (sameWords(input.next(),"y")){
                    if (!words.isEmpty()) {
                        game(words);
                    }else {
                        System.out.println("There is no word remaining!");
                        return;
                    }
                }else {
                    return;
                }
            }else if (guess.length() > 1){
                System.out.println("You didn't find!");
                System.out.println("Enter a letter in word " + hiddenWord + " or try to guess");
                countOfTry++;
            }
        }while (countOfTry < TRY_LIMIT);
        System.out.println("The word is " + word + "  You are dead!Do you want to guess another word?Enter y or n");
        if (input.next().charAt(0) == 'y'){
            if (!words.isEmpty()){
                game(words);
            }else {
                System.out.println("There is no word remaining!");
                return;
            }
        }else {
            return;
        }
    }
    public static boolean sameWords(String word,String guess){
        if (word.length() != guess.length()){
            return false;
        }
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != guess.charAt(i)){
                return false;
            }
        }
        return true;
    }

}
