package chapters.chapter_06.exercises;

public class Exercise_01 {
    public static void main(String[] args) {
        final int NUMBER_OF_PENTAGONALS = 100;
        final int NUMBER_PER_LINE = 10;
        int count = 0;
        for (int i = 1; i <= NUMBER_OF_PENTAGONALS; i++) {
            count++;
            if (count % NUMBER_PER_LINE == 0) {
                System.out.println(getPentagonalNumber(i));
            }else {
                System.out.printf("%-6d",getPentagonalNumber(i));
            }
        }
    }
    public static int getPentagonalNumber(int n){
            int pentagonalNumber = n * (3 * n - 1) / 2;
            return pentagonalNumber;
        }
    }
