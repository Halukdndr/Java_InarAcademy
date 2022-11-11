package chapters.chapter_10.checkpoints;

public class CheckPoint_09 {
    public static void main(String[] args) {
        Integer i = new Integer(12);
        String s = i.toString();

        i = Integer.parseInt(s);

        Double d = new Double(12.4);
        String s2 = d.toString();
        d = Double.parseDouble(s2);
    }
}
