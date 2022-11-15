package chapters.chapter_10.checkpoints;

public class CheckPoint_17 {
    public static void main(String[] args) {
        String s1 = "Welcome to Java";
        String s2 = s1.replace("o", "abc");
        System.out.println(s1); // Welcome to Java
        System.out.println(s2); // Welcabcme tabc Java
    }
}
