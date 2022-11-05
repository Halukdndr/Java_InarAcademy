package chapters.chapter_09.checkpoints;

public class CheckPoint_31 {
    private static int i = 0;
    private static int j = 0;
    public static void main(String[] args) {
        int i = 2;
        int k = 3;
        {
            int j = 3;
            System.out.println("i + j is " + (i + j));  //5
        }
        k = i + j;
        System.out.println("k is " + k);    //2
        System.out.println("j is " + j);    //0
    }
}