package chapters.chapter_06.exercises;

import chapters.chapter_06.examples.RandomCharacter;

import java.util.Random;

public class Exercise_38 {
    public static void main(String[] args) {
        final int CHARS_PER_LINE = 10;
        for (int i = 1;i <= 100;i++) {
            printCharacters(RandomCharacter.getRandomUpperCaseLetter(),i,CHARS_PER_LINE);
        }
        for (int i = 1;i <= 100;i++){
            printCharacters(RandomCharacter.getRandomDigitCharacter(),i,CHARS_PER_LINE);
        }
    }

    public static void printCharacters(char ch,int count,int charsPerLine) {
        if (count % charsPerLine == 0){
            System.out.println(ch);
        }else {
            System.out.print(ch);
        }
    }
}
