package weeks.week_15;

import java.util.Scanner;

public class TheFirstUndublicatedVovel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = input.nextLine();
        str = str.toLowerCase();

        System.out.println("The index of the first undublicated vovel is " + getTheFirstUndublicatedVovel(str));

    }

    public static int getTheFirstUndublicatedVovel(String str) {
        int countA = 0;
        int countE = 0;
        int countI = 0;
        int countO = 0;
        int countU = 0;
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'a':
                    countA++;
                    break;
                case 'e':
                    countE++;
                    break;
                case 'i':
                    countI++;
                    break;
                case 'o':
                    countO++;
                    break;
                case 'u':
                    countU++;
                    break;
            }
        }
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'a':
                    if (countA == 1) {
                        return i;
                    }
                    break;
                case 'e':
                    if (countE == 1) {
                        return i;
                    }
                    break;
                case 'i':
                    if (countI == 1) {
                        return i;
                    }
                    break;
                case 'o':
                    if (countO == 1) {
                        return i;
                    }
                    break;
                case 'u':
                    if (countU == 1) {
                        return i;
                    }
                    break;
            }
        }


        return -1;

    }
}