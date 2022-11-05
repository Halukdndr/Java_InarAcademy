package chapters.chapter_09.checkpoints;

public class CheckPoint_33 {
    private int p;

    public CheckPoint_33() {
        System.out.println("C's no-arg constructor invoked");
    //    this(0);  //  in constructor this keyword must be used in the first statement
        }

    public CheckPoint_33(int p) {
        p = p;  // this.p = p;
    }

    public void setP(int p) {
        p = p;   // this.p = p;
 }
}
