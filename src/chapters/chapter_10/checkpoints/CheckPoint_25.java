package chapters.chapter_10.checkpoints;

public class CheckPoint_25 {
    public static void main(String[] args) {
        String s = "Hi, Good Morning";
        System.out.println(m(s));  // 3
    }
    public static int m(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++)
            if (Character.isUpperCase(s.charAt(i)))
                count++;
        return count;
    }
}
