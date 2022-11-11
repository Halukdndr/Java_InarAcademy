package chapters.chapter_09.exercises;

public class Location {
    public int row;
    public int col;
    public double maxValue;

    public Location(int row, int col, double maxValue) {
        this.row = row;
        this.col = col;
        this.maxValue = maxValue;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public double getMaxValue() {
        return maxValue;
    }
    public void display(){
        System.out.println("The location of the largest element is " + getMaxValue() + " at (" + getRow() + ", " + getCol() + ")");
    }
}

