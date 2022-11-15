package chapters.chapter_10.checkpoints;

public class CheckPoint_22 {

    private String text;

    public CheckPoint_22(String s){  // This constructor dont assing data field
        String text = s;  // this.text = s; solves the problem
    }

    public static void main(String[] args) {
        CheckPoint_22 test = new CheckPoint_22("ABC");
        System.out.println(test.text.toLowerCase());
    }               // throws a NullPointerException because we did not assign a value to text data field .

}

