package chapters.chapter_10.checkpoints;

public class CheckPoint_29 {
    public static void main(String[] args) {
        String s = "I love Inar Academy.";
        StringBuilder stringBuilder = new StringBuilder(s).delete(4,10);
        s = stringBuilder.toString();
        System.out.println(s);
    }
}
