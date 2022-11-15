package chapters.chapter_10.checkpoints;

public class CheckPoint_32 {
    public static void main(String[] args) {
        String s = "Java";
        StringBuilder builder = new StringBuilder(s);
        change(s, builder);
        System.out.println(s);  // Java
        System.out.println(builder);  // Java and HTML
    }
    private static void change(String s, StringBuilder builder) {
        s = s + " and HTML";
        builder.append(" and HTML");
    }
}
