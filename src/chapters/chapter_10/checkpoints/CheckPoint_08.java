package chapters.chapter_10.checkpoints;

public class CheckPoint_08 {
    public static void main(String[] args) {
        Integer i = new Integer("23");

        Integer j = new Integer(23);

        Integer k = Integer.valueOf("23");

        Integer r = Integer.parseInt("23", 8); // 19

       // Double d = new Double(); //needs to be specified by a double value(new Double(5.0))
        Double d = new Double(5.0);

        Double c = Double.valueOf("23.45");

        int p = (Integer.valueOf("23")).intValue();

        double s = (Double.valueOf("23.4")).doubleValue();

        int y = (Double.valueOf("23.4")).intValue();

        String e = (Double.valueOf("23.4")).toString();

    }
}
