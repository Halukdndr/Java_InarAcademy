package chapters.chapter_11.checkpoint;

public class CheckPoint_22 {
    public static void main(String[] args) {
         L a = new L(3);
        }
 }

          class L extends P {
 public L(int t) {
         System.out.println("L's constructor is invoked");
         }
 }

         class P {
 public P() {                                               // P's constructor is invoked
         System.out.println("P's constructor is invoked");  //L's constructor is invoked
        }
}
