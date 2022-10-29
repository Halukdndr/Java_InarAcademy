package chapters.chapter_08.exercises;

public class Exercise_23 {
    public static void main(String[] args) {

        int[][] matrix = Exercise_22.getMatrix();
        if (Exercise_22.isEvenNumberOf1s(matrix)){
            System.out.println("There is no flipped cell");
            System.exit(0);
        }
        int indexOfFlipedCellRow = -1;
        int indexOfFlipedCellCol = -1;
        outside:
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == 0){
                    matrix[row][col] = 1;
                    if (Exercise_22.isEvenNumberOf1s(matrix)){
                        indexOfFlipedCellRow = row;
                        indexOfFlipedCellCol = col;
                        matrix[row][col] = 0;
                        break outside;
                    }else {
                        matrix[row][col] = 0;
                    }
                }else{
                    matrix[row][col] = 0;
                    if (Exercise_22.isEvenNumberOf1s(matrix)){
                        indexOfFlipedCellRow = row;
                        indexOfFlipedCellCol = col;
                        matrix[row][col] = 1;
                        break outside;
                    }else {
                        matrix[row][col] = 1;
                    }
                }
            }
        }
        if (indexOfFlipedCellRow == -1 || indexOfFlipedCellCol == -1){
            System.out.println("There are more than one flipped cell");
            System.exit(0);
        }
        System.out.println("The flipped cell is at (" + indexOfFlipedCellRow + ", " + indexOfFlipedCellCol + ")");
    }
}