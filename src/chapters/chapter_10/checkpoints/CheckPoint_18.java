package chapters.chapter_10.checkpoints;

public class CheckPoint_18 {
    public static void main(String[] args) {
       String s1 = "Welcome";
       String s2 = "welcome";
       s2 = s1.replace('e','E');
        System.out.println("s1 = " + s1);  // Welcome
        System.out.println("s2 = " + s2);  // WElcomE
        System.out.println("After split");

        String[] tokens = "Welcome to Java and HTML".split(" ");
        s1 = tokens[0];
        s2 = tokens[1];
        System.out.println("s1 = " + s1); // Welcome
        System.out.println("s2 = " + s2); // to

    }
}
