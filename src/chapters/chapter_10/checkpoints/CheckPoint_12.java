package chapters.chapter_10.checkpoints;

public class CheckPoint_12 {
    public static void main(String[] args) {
        Integer x = 3 + new Integer(5); // 5 is autounboxed, 8 is autoboxed to object x
        System.out.println(x); // x is autounboxed

        Integer y = 3; //autoboxing

        //Double z = 3; it must be a floating number to assign
        Double t = 3.0;


        int l = new Integer(3);
        int p = new Integer(3) + new Integer(4);
    }
}
