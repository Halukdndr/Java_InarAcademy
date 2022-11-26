package chapters.chapter_12.checkpoints;

public class CheckPoint_07_08 {
    /*07
    This class is the super class of the exception classes and has two subclasses
    error class internal system errors like syntax error,
    Exception class h describes errors caused by your program and by external circumstances
    can be handled
   */
    /*08
      public static void main(String[] args) {
        System.out.println(1 / 0);       // ArithmeticException
    }
    */
    /*public static void main(String[] args) {
        int[] list = new int[5];
        System.out.println(list[5]);  // ArrayIndexOutOfBoundsException
    }
     */
   /* public static void main(String[] args) {
        String s = "abc";
        System.out.println(s.charAt(3));   //StringIndexOutOfBoundsException
    }
     */
    /*
    public static void main(String[] args) {
        Object o = new Object();
        String d = (String)o;   // ClassCastException
    }
     */
    /*public static void main(String[] args) {
        Object o = null;
        System.out.println(o.toString());  // NullPointerException
    }
     */
    public static void main(String[] args) {
        System.out.println(1.0 / 0);  // does not throw exception  infinity
    }
}
